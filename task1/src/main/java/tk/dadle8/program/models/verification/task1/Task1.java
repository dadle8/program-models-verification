package tk.dadle8.program.models.verification.task1;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangParser;
import tk.dadle8.program.models.verification.task1.parser.ConcreteTreeListener;
import tk.dadle8.program.models.verification.task1.util.ParserUtils;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Task1");

        ParserUtils parserUtils = new ParserUtils();

        ProLangParser parser = parserUtils.getParseTreeFromFile("text.txt");
        ParseTree tree = parser.source();
        ConcreteTreeListener listener = new ConcreteTreeListener(parser);
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        parserUtils.writeFile(listener.toString(), "task1/out/result.txt");
    }
}