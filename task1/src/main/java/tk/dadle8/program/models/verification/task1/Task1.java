package tk.dadle8.program.models.verification.task1;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangLexer;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangParser;
import tk.dadle8.program.models.verification.task1.parser.ConcreteTreeListener;
import tk.dadle8.program.models.verification.task1.util.ParserUtils;

import java.io.IOException;

public class Task1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Task1");

        ParserUtils parserUtils = new ParserUtils();

        ProLangLexer lexer = new ProLangLexer(CharStreams.fromStream(parserUtils.getFile()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProLangParser parser = new ProLangParser(tokens);
        ParseTree tree = parser.source();

        ConcreteTreeListener listener = new ConcreteTreeListener(parser);
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        parserUtils.writeFile(listener.toString(), "task1/out/result.txt");
    }
}