package tk.dadle8.program.models.verification.task2.parser;

import tk.dadle8.program.models.verification.task1.antlr4.ProLangBaseListener;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangParser;
import tk.dadle8.program.models.verification.task2.model.ControlFlowBlock;

import java.util.*;
import java.util.stream.Collectors;

public class ControlFlowGraphListener extends ProLangBaseListener {

    private Map<Integer, ControlFlowBlock> blockList = new LinkedHashMap<>();

    private ControlFlowBlock currentFlowBlock;
    private int blockId = 0;

    private int ifLevel = 0;
    private int whileLevel = 0;

    private Map<Integer, Map<String, ControlFlowBlock>> ifBlocks = new HashMap<>();
    private Map<Integer, Map<String, ControlFlowBlock>> whileBlocks = new HashMap<>();

    public ControlFlowGraphListener() {
    }

    @Override
    public void enterIfCondition(ProLangParser.IfConditionContext ctx) {
        setNewBlockToCurrent(Collections.singletonList(ctx.getText()));

        ifBlocks.get(ifLevel).put("if", currentFlowBlock);
    }

    @Override
    public void enterThenStatements(ProLangParser.ThenStatementsContext ctx) {
        setNewBlockToCurrent(new ArrayList<>());

        ifBlocks.get(ifLevel).get("if").setNext(currentFlowBlock);
    }

    @Override
    public void exitThenStatements(ProLangParser.ThenStatementsContext ctx) {
        ifBlocks.get(ifLevel).put("then", currentFlowBlock);
    }

    @Override
    public void enterElseStatements(ProLangParser.ElseStatementsContext ctx) {
        setNewBlockToCurrent(new ArrayList<>());

        ifBlocks.get(ifLevel).get("if").setBranch(currentFlowBlock);
    }

    @Override
    public void exitElseStatements(ProLangParser.ElseStatementsContext ctx) {
        ifBlocks.get(ifLevel).put("else", currentFlowBlock);
    }

    @Override
    public void enterStatementExpr(ProLangParser.StatementExprContext ctx) {
        var block = getCFBlock();
        block.getText().add(ctx.getText());

        if (ctx.getParent() instanceof ProLangParser.ThenStatementsContext && block.getNext() == null) {
            ifBlocks.get(ifLevel).put("then", block);
        }
        if (ctx.getParent() instanceof ProLangParser.ElseStatementsContext && block.getNext() == null) {
            ifBlocks.get(ifLevel).put("else", block);
        }
        if (ctx.getParent() instanceof ProLangParser.WhileStatementsContext && block.getNext() == null) {
            whileBlocks.get(whileLevel).put("statements",block);
        }
    }

    @Override
    public void enterStatementIf(ProLangParser.StatementIfContext ctx) {
        ifLevel++;
        ifBlocks.put(ifLevel, new HashMap<>());
    }

    @Override
    public void exitStatementIf(ProLangParser.StatementIfContext ctx) {
        var newBlock = createCFBlock(new ArrayList<>());
        var ifElseBlocks = ifBlocks.get(ifLevel);

        ifElseBlocks.get("then").setNext(newBlock);
        ifElseBlocks.get("else").setNext(newBlock);

        currentFlowBlock = newBlock;
        ifLevel--;
    }

    @Override
    public void enterStatementWhile(ProLangParser.StatementWhileContext ctx) {
        whileLevel++;
        whileBlocks.put(whileLevel, new HashMap<>());
    }

    @Override
    public void exitStatementWhile(ProLangParser.StatementWhileContext ctx) {
        var newBlock = createCFBlock(new ArrayList<>());
        var ifWhile = whileBlocks.get(whileLevel);

        ifWhile.get("while").setBranch(newBlock);
        ifWhile.get("statements").setNext(ifWhile.get("while"));

        currentFlowBlock = newBlock;
        whileLevel--;
    }

    @Override
    public void enterWhileCondition(ProLangParser.WhileConditionContext ctx) {
        setNewBlockToCurrent(Collections.singletonList(ctx.getText()));
        whileBlocks.get(whileLevel).put("while",currentFlowBlock);
    }

    @Override
    public void enterWhileStatements(ProLangParser.WhileStatementsContext ctx) {
        setNewBlockToCurrent(new ArrayList<>());

        whileBlocks.get(whileLevel).get("while").setNext(currentFlowBlock);
    }

    @Override
    public void exitWhileStatements(ProLangParser.WhileStatementsContext ctx) {
        whileBlocks.get(whileLevel).put("statements", currentFlowBlock);
    }

    @Override
    public String toString() {
        return blockList.values().stream().map(ControlFlowBlock::toString).collect(Collectors.joining("\n\n"));
    }

    private int getNextBlockId() {
        return blockId++;
    }

    private ControlFlowBlock createCFBlock(List<String> text) {
        var newBlock = new ControlFlowBlock(getNextBlockId(), null, null, text);
        blockList.put(newBlock.getId(), newBlock);

        return newBlock;
    }

    private ControlFlowBlock getCFBlock() {
        if (currentFlowBlock == null) {
            currentFlowBlock = createCFBlock(new ArrayList<>());
        }
        return currentFlowBlock;
    }

    private void setNewBlockToCurrent(List<String> text) {
        var newBlock = createCFBlock(text);
        currentFlowBlock.setNext(newBlock);

        currentFlowBlock = newBlock;
    }
}

