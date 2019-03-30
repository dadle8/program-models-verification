package tk.dadle8.program.models.verification.task2.parser;

import tk.dadle8.program.models.verification.task1.antlr4.ProLangBaseListener;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangParser;
import tk.dadle8.program.models.verification.task2.model.ControlFlowBlock;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ControlFlowGraphListener extends ProLangBaseListener {

    private Map<Integer, ControlFlowBlock> blockList = new LinkedHashMap<>();
    private List<ControlFlowBlock> withoutNextBlockList = new ArrayList<>();
    private int currentBlockId = 1;
    private int blockId = 1;
    private int currentBranchId = 1;

    public ControlFlowGraphListener() {
        blockList.put(currentBlockId, new ControlFlowBlock(currentBlockId, new ArrayList<>(), currentBranchId, new ArrayList<>()));
    }

    @Override
    public void enterStatementExp(ProLangParser.StatementExpContext ctx) {
        if (ctx.getParent() instanceof ProLangParser.IfStatementContext
                || ctx.getParent() instanceof ProLangParser.ElseStatementContext
                || ctx.getParent() instanceof ProLangParser.StatementWhileContext) {
            return;
        }
        blockList.get(currentBlockId).getText().add(ctx.getText());
    }

    @Override
    public void enterStatementIf(ProLangParser.StatementIfContext ctx) {
        currentBlockId++;
        currentBranchId++;
        var ifBlock = new ControlFlowBlock(currentBlockId, new ArrayList<>(), currentBranchId, ctx.ifStatement().statement().stream().map(s -> s.getText()).collect(Collectors.toList()));
        blockList.get(currentBlockId - 1).getNext().add(ifBlock);
        blockList.get(currentBlockId - 1).getText().add(ctx.ifexpr().getText() + " condition");
        blockList.put(currentBlockId, ifBlock);

        currentBlockId++;
        currentBranchId++;
        var elseBlock = new ControlFlowBlock(currentBlockId, new ArrayList<>(), currentBranchId, ctx.elseStatement().statement().stream().map(s -> s.getText()).collect(Collectors.toList()));
        blockList.get(currentBlockId - 2).getNext().add(elseBlock);
        blockList.put(currentBlockId, elseBlock);
    }

    @Override
    public void exitStatementIf(ProLangParser.StatementIfContext ctx) {
        currentBlockId++;
        currentBranchId++;
        var newBlock = new ControlFlowBlock(currentBlockId, new ArrayList<>(), currentBranchId, new ArrayList<>());
        blockList.get(currentBlockId - 1).getNext().add(newBlock);
        blockList.get(currentBlockId - 2).getNext().add(newBlock);
        blockList.put(currentBlockId, newBlock);
    }

    @Override
    public void enterStatementWhile(ProLangParser.StatementWhileContext ctx) {
        currentBlockId++;
        currentBranchId++;
        var whileBlock = new ControlFlowBlock(currentBlockId, new ArrayList<>(), currentBranchId,
                ctx.statement().stream().filter(s -> !(s instanceof ProLangParser.StatementWhileContext
                        || s instanceof ProLangParser.StatementIfContext)).map(s -> s.getText()).collect(Collectors.toList()));
        blockList.get(currentBlockId - 1).getNext().add(whileBlock);
        blockList.get(currentBlockId - 1).getText().add(ctx.expr().getText() + " condition");
        blockList.put(currentBlockId, whileBlock);
    }

    @Override
    public void exitStatementWhile(ProLangParser.StatementWhileContext ctx) {
        if (!(ctx.getParent() instanceof ProLangParser.StatementWhileContext)) {
            currentBlockId++;
            currentBranchId++;
            var newBlock = new ControlFlowBlock(currentBranchId, new ArrayList<>(), currentBranchId, new ArrayList<>());
            blockList.get(currentBlockId - 2).getNext().add(newBlock);
            blockList.put(currentBlockId, newBlock);
        } else {
            blockList.get(currentBlockId).getNext().add(blockList.get(currentBlockId - 1));
        }
    }

    @Override
    public String toString() {
        return String.join("\n\n", blockList.values().stream().map(block -> block.toString()).collect(Collectors.toList()));
    }

    private int getCurrentBlockId() {
        return blockId++;
    }
}

