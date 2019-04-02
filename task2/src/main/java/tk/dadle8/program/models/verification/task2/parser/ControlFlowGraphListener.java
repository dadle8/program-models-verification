package tk.dadle8.program.models.verification.task2.parser;

import tk.dadle8.program.models.verification.task1.antlr4.ProLangBaseListener;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangParser;
import tk.dadle8.program.models.verification.task2.model.ControlFlowBlock;

import java.util.*;
import java.util.stream.Collectors;

public class ControlFlowGraphListener extends ProLangBaseListener {

    private Map<Integer, ControlFlowBlock> controlFlowBlocks = new LinkedHashMap<>();

    private ControlFlowBlock currentControlFlowBlock;
    private int blockId = 0;

    private int statementIfContextLevel = 0;
    private int statementWhileContextLevel = 0;

    private Map<Integer, Map<String, ControlFlowBlock>> statementIfContexts = new HashMap<>();
    private Map<Integer, Map<String, ControlFlowBlock>> statementWhileContexts = new HashMap<>();
    private Map<Integer, List<ControlFlowBlock>> statementBreakContexts = new HashMap<>();

    public ControlFlowGraphListener() {
    }

    @Override
    public void enterIfCondition(ProLangParser.IfConditionContext ctx) {
        setNewBlockToCurrent(Collections.singletonList(ctx.getText()));

        putControlFlowBlockOnIfContext("if", currentControlFlowBlock);
    }

    @Override
    public void enterThenStatements(ProLangParser.ThenStatementsContext ctx) {
        setNewBlockToCurrent(new ArrayList<>());

        getControlFlowBlockOnIfContext("if").setNext(currentControlFlowBlock);
    }

    @Override
    public void exitThenStatements(ProLangParser.ThenStatementsContext ctx) {
        putControlFlowBlockOnIfContext("then", currentControlFlowBlock);
    }

    @Override
    public void enterElseStatements(ProLangParser.ElseStatementsContext ctx) {
        setNewBlockToCurrent(new ArrayList<>());

        getControlFlowBlockOnIfContext("if").setBranch(currentControlFlowBlock);
    }

    @Override
    public void exitElseStatements(ProLangParser.ElseStatementsContext ctx) {
        putControlFlowBlockOnIfContext("else", currentControlFlowBlock);
    }

    @Override
    public void enterStatementExpr(ProLangParser.StatementExprContext ctx) {
        var block = getCFBlock();
        block.getText().add(ctx.getText());
    }

    @Override
    public void enterStatementIf(ProLangParser.StatementIfContext ctx) {
        statementIfContextLevel++;
        statementIfContexts.put(statementIfContextLevel, new HashMap<>());
    }

    @Override
    public void exitStatementIf(ProLangParser.StatementIfContext ctx) {
        var newBlock = createCFBlock(new ArrayList<>());
        var ifElseBlocks = statementIfContexts.get(statementIfContextLevel);

        ifElseBlocks.get("then").setNext(newBlock);
        if (ifElseBlocks.get("else") == null) {
            ifElseBlocks.get("if").setNext(newBlock);
        } else {
            ifElseBlocks.get("else").setNext(newBlock);
        }

        currentControlFlowBlock = newBlock;
        statementIfContextLevel--;
    }

    @Override
    public void enterStatementWhile(ProLangParser.StatementWhileContext ctx) {
        statementWhileContextLevel++;
        statementWhileContexts.put(statementWhileContextLevel, new HashMap<>());
        statementBreakContexts.put(statementWhileContextLevel, new ArrayList<>());
    }

    @Override
    public void exitStatementWhile(ProLangParser.StatementWhileContext ctx) {
        var newBlock = createCFBlock(new ArrayList<>());
        var ifWhile = statementWhileContexts.get(statementWhileContextLevel);
        var breaks = statementBreakContexts.get(statementWhileContextLevel);

        ifWhile.get("while").setBranch(newBlock);
        ifWhile.get("statements").setNext(ifWhile.get("while"));

        breaks.forEach(b -> b.setNext(newBlock));

        currentControlFlowBlock = newBlock;
        statementWhileContextLevel--;
    }

    @Override
    public void enterWhileCondition(ProLangParser.WhileConditionContext ctx) {
        setNewBlockToCurrent(Collections.singletonList(ctx.getText()));
        statementWhileContexts.get(statementWhileContextLevel).put("while", currentControlFlowBlock);
    }

    @Override
    public void enterWhileStatements(ProLangParser.WhileStatementsContext ctx) {
        setNewBlockToCurrent(new ArrayList<>());

        statementWhileContexts.get(statementWhileContextLevel).get("while").setNext(currentControlFlowBlock);
    }

    @Override
    public void exitWhileStatements(ProLangParser.WhileStatementsContext ctx) {
        statementWhileContexts.get(statementWhileContextLevel).put("statements", currentControlFlowBlock);
    }

    @Override
    public void enterStatementBreak(ProLangParser.StatementBreakContext ctx) {
        setNewBlockToCurrent(Collections.singletonList(ctx.getText()));
        statementBreakContexts.get(statementWhileContextLevel).add(currentControlFlowBlock);
    }

    @Override
    public String toString() {
        return controlFlowBlocks.values().stream().map(ControlFlowBlock::toString).collect(Collectors.joining("\n\n"));
    }

    private int getNextBlockId() {
        return blockId++;
    }

    private ControlFlowBlock createCFBlock(List<String> text) {
        var newBlock = new ControlFlowBlock(getNextBlockId(), null, null, text);
        controlFlowBlocks.put(newBlock.getId(), newBlock);

        return newBlock;
    }

    private ControlFlowBlock getCFBlock() {
        if (currentControlFlowBlock == null) {
            currentControlFlowBlock = createCFBlock(new ArrayList<>());
        }
        return currentControlFlowBlock;
    }

    private void setNewBlockToCurrent(List<String> text) {
        var newBlock = createCFBlock(text);
        currentControlFlowBlock.setNext(newBlock);

        currentControlFlowBlock = newBlock;
    }
    
    private void putControlFlowBlockOnIfContext(String key, ControlFlowBlock controlFlowBlock) {
        statementIfContexts.get(statementIfContextLevel).put(key, controlFlowBlock);
    }

    private ControlFlowBlock getControlFlowBlockOnIfContext(String key) {
        return statementIfContexts.get(statementIfContextLevel).get(key);
    }
}

