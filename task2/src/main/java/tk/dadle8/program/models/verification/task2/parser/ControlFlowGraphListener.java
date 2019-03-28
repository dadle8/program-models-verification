package tk.dadle8.program.models.verification.task2.parser;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Trees;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangBaseListener;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangParser;

import java.util.Arrays;
import java.util.List;

public class ControlFlowGraphListener extends ProLangBaseListener {

    /* Platform dependent end-of-line marker */
    private static final String Eol = System.lineSeparator();

    private final List<String> ruleNames;
    private final StringBuilder builder = new StringBuilder();

    public ControlFlowGraphListener(Parser parser) {
        this.ruleNames = Arrays.asList(parser.getRuleNames());
    }

    public ControlFlowGraphListener(List<String> ruleNames) {
        this.ruleNames = ruleNames;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        builder.append(Utils.escapeWhitespace(Trees.getNodeText(node, ruleNames), false));
    }

    @Override
    public void enterExp(ProLangParser.ExpContext ctx) {
//        builder.append(ctx.getText());
    }

    @Override
    public void exitExp(ProLangParser.ExpContext ctx) {
//        builder.append(Eol);
    }

    @Override
    public void enterStatementIf(ProLangParser.StatementIfContext ctx) {

    }


    @Override
    public void visitErrorNode(ErrorNode node) {
        if (builder.length() > 0) {
            builder.append(' ');
        }

        builder.append(Utils.escapeWhitespace(Trees.getNodeText(node, ruleNames), false));
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof ProLangParser.ExprContext && !(ctx.getParent() instanceof ProLangParser.ExprContext)) {
            builder.append(ctx.getText());
            builder.append(Eol);
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
//        builder.append(Eol);
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}

