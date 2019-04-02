package tk.dadle8.program.models.verification.task2.parser;

import tk.dadle8.program.models.verification.task1.antlr4.ProLangBaseListener;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangParser;
import tk.dadle8.program.models.verification.task2.model.ControlFlowBlock;

import java.util.*;
import java.util.stream.Collectors;

public class ControlFlowGraphListener extends ProLangBaseListener {

    private Map<Integer, ControlFlowBlock> controlFlowGraph = new LinkedHashMap<>();

    private ControlFlowBlock currentCFB;
    private int blockId = 0;

    private int ifContextLevel = 0;
    private int whileContextLevel = 0;

    private Map<Integer, Map<String, ControlFlowBlock>> ifContexts = new HashMap<>();
    private Map<Integer, Map<String, ControlFlowBlock>> whileContexts = new HashMap<>();
    private Map<Integer, List<ControlFlowBlock>> breakWhileContexts = new HashMap<>();
    private Map<Integer, Map<String, ControlFlowBlock>> doContexts = new HashMap<>();
    private Map<Integer, List<ControlFlowBlock>> breakDoContexts = new HashMap<>();

    public ControlFlowGraphListener() {
    }

    @Override
    public void enterIfCondition(ProLangParser.IfConditionContext ctx) {
        setNewBlockToCurrent(Collections.singletonList(ctx.getText()));

        putCFBToIfContext("if", currentCFB);
    }

    @Override
    public void enterThenStatements(ProLangParser.ThenStatementsContext ctx) {
        setNewBlockToCurrent(new ArrayList<>());

        getCFBFromIfContext().setNext(currentCFB);
    }

    @Override
    public void exitThenStatements(ProLangParser.ThenStatementsContext ctx) {
        putCFBToIfContext("then", currentCFB);
    }

    @Override
    public void enterElseStatements(ProLangParser.ElseStatementsContext ctx) {
        setNewBlockToCurrent(new ArrayList<>());

        getCFBFromIfContext().setBranch(currentCFB);
    }

    @Override
    public void exitElseStatements(ProLangParser.ElseStatementsContext ctx) {
        putCFBToIfContext("else", currentCFB);
    }

    @Override
    public void enterStatementExpr(ProLangParser.StatementExprContext ctx) {
        var block = getCFBlock();
        block.getText().add(ctx.getText());
    }

    @Override
    public void enterStatementIf(ProLangParser.StatementIfContext ctx) {
        ifContextLevel++;
        ifContexts.put(ifContextLevel, new HashMap<>());
    }

    @Override
    public void exitStatementIf(ProLangParser.StatementIfContext ctx) {
        var newBlock = createCFBlock(new ArrayList<>());
        var ifElseBlocks = ifContexts.get(ifContextLevel);

        ifElseBlocks.get("then").setNext(newBlock);
        if (ifElseBlocks.get("else") == null) {
            ifElseBlocks.get("if").setNext(newBlock);
        } else {
            ifElseBlocks.get("else").setNext(newBlock);
        }

        currentCFB = newBlock;
        ifContextLevel--;
    }

    @Override
    public void enterStatementWhile(ProLangParser.StatementWhileContext ctx) {
        whileContextLevel++;
        whileContexts.put(whileContextLevel, new HashMap<>());
        breakWhileContexts.put(whileContextLevel, new ArrayList<>());
    }

    @Override
    public void exitStatementWhile(ProLangParser.StatementWhileContext ctx) {
        var newBlock = createCFBlock(new ArrayList<>());
        var ifWhile = whileContexts.get(whileContextLevel);
        var breaks = breakWhileContexts.get(whileContextLevel);

        ifWhile.get("while").setBranch(newBlock);
        ifWhile.get("statements").setNext(ifWhile.get("while"));

        breaks.forEach(b -> b.setNext(newBlock));

        currentCFB = newBlock;
        whileContextLevel--;
    }

    @Override
    public void enterWhileCondition(ProLangParser.WhileConditionContext ctx) {
        setNewBlockToCurrent(Collections.singletonList(ctx.getText()));
        whileContexts.get(whileContextLevel).put("while", currentCFB);
    }

    @Override
    public void enterWhileStatements(ProLangParser.WhileStatementsContext ctx) {
        setNewBlockToCurrent(new ArrayList<>());

        whileContexts.get(whileContextLevel).get("while").setNext(currentCFB);
    }

    @Override
    public void exitWhileStatements(ProLangParser.WhileStatementsContext ctx) {
        whileContexts.get(whileContextLevel).put("statements", currentCFB);
    }

    @Override
    public void enterStatementBreak(ProLangParser.StatementBreakContext ctx) {
        setNewBlockToCurrent(Collections.singletonList(ctx.getText()));
        breakWhileContexts.get(whileContextLevel).add(currentCFB);
    }

    @Override
    public String toString() {
        return controlFlowGraph.values().stream().map(ControlFlowBlock::toString).collect(Collectors.joining("\n\n"));
    }

    private int getNextBlockId() {
        return blockId++;
    }

    private ControlFlowBlock createCFBlock(List<String> text) {
        var newBlock = new ControlFlowBlock(getNextBlockId(), null, null, text);
        controlFlowGraph.put(newBlock.getId(), newBlock);

        return newBlock;
    }

    private ControlFlowBlock getCFBlock() {
        if (currentCFB == null) {
            currentCFB = createCFBlock(new ArrayList<>());
        }
        return currentCFB;
    }

    private void setNewBlockToCurrent(List<String> text) {
        var newBlock = createCFBlock(text);
        currentCFB.setNext(newBlock);

        currentCFB = newBlock;
    }
    
    private void putCFBToIfContext(String key, ControlFlowBlock controlFlowBlock) {
        ifContexts.get(ifContextLevel).put(key, controlFlowBlock);
    }

    private ControlFlowBlock getCFBFromIfContext() {
        return ifContexts.get(ifContextLevel).get("if");
    }
}

