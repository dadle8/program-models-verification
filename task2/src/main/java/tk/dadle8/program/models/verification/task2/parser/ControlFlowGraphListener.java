package tk.dadle8.program.models.verification.task2.parser;

import tk.dadle8.program.models.verification.task1.antlr4.ProLangBaseListener;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangParser;
import tk.dadle8.program.models.verification.task2.model.ControlFlowBlock;

import java.util.*;
import java.util.stream.Collectors;

public class ControlFlowGraphListener extends ProLangBaseListener {

    private Map<Integer, ControlFlowBlock> blockList = new LinkedHashMap<>();
    private Map<Integer, ControlFlowBlock> withoutNextBlockList = new HashMap<>();

    private ControlFlowBlock currentFlowBlock;
    private int blockId = 0;

    private int ifLevel = 0;
    private int whileLevel = 0;

    private Map<Integer, List<ControlFlowBlock>> ifBlocks = new HashMap<>();
    private Map<Integer, ControlFlowBlock> whileBlocks = new HashMap<>();

    public ControlFlowGraphListener() {
    }

    @Override
    public void enterStatementExp(ProLangParser.StatementExpContext ctx) {
        if (ctx.getParent() instanceof ProLangParser.IfStatementContext) {
            ifBlocks.get(ifLevel).get(0).getText().add(ctx.getText());
            return;
        }
        if (ctx.getParent() instanceof ProLangParser.ElseStatementContext) {
            ifBlocks.get(ifLevel).get(1).getText().add(ctx.getText());
            return;
        }
        if (ctx.getParent() instanceof ProLangParser.StatementWhileContext) {
            whileBlocks.get(whileLevel).getText().add(ctx.getText());
            return;
        }
        getCFBlock().getText().add(ctx.getText());

    }

    @Override
    public void enterStatementIf(ProLangParser.StatementIfContext ctx) {
        var conditionBlock = createCFBlock(Collections.singletonList(ctx.ifexpr().getText()));
        currentFlowBlock = null;

        var ifBlock = createCFBlock(new ArrayList<>());
        var elseBlock = ctx.elseStatement() == null ? new ControlFlowBlock() : createCFBlock(new ArrayList<>());
        ifLevel++;
        ifBlocks.put(ifLevel, List.of(ifBlock, elseBlock));
    }

    @Override
    public void exitStatementIf(ProLangParser.StatementIfContext ctx) {
        currentFlowBlock = null;
        ifLevel--;
    }

    @Override
    public void enterStatementWhile(ProLangParser.StatementWhileContext ctx) {
        var conditionBlock = createCFBlock(Collections.singletonList(ctx.expr().getText()));
        currentFlowBlock = null;

        var bodyWhile = createCFBlock(new ArrayList<>());
        whileLevel++;
        whileBlocks.put(whileLevel, bodyWhile);
    }

    @Override
    public void exitStatementWhile(ProLangParser.StatementWhileContext ctx) {
        currentFlowBlock = null;
        whileLevel--;
    }

    @Override
    public String toString() {
        return String.join("\n\n", blockList.values().stream().map(block -> block.toString()).collect(Collectors.toList()));
    }

    private int getNextBlockId() {
        return blockId++;
    }

    private ControlFlowBlock createCFBlock(List<String> text) {
        var newBlock = new ControlFlowBlock(getNextBlockId(), new ArrayList<>(), 0, text);
        blockList.put(newBlock.getId(), newBlock);

        return newBlock;
    }

    private ControlFlowBlock getCFBlock() {
        if (currentFlowBlock == null) {
            currentFlowBlock = createCFBlock(new ArrayList<>());
        }
        return currentFlowBlock;
    }
}

