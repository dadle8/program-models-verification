package tk.dadle8.program.models.verification.parser;

import tk.dadle8.antlr4.ProLangBaseListener;
import tk.dadle8.antlr4.ProLangParser;

public class SpecificListener extends ProLangBaseListener {

    @Override
    public void enterSource(ProLangParser.SourceContext ctx) {
        System.out.println("In Source: " + ctx.getText());
    }

    @Override
    public void exitSource(ProLangParser.SourceContext ctx) {
        System.out.println("In Source: " + ctx.getText());
    }
}
