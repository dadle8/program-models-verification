package tk.dadle8.program.models.verification.task2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangLexer;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangParser;
import tk.dadle8.program.models.verification.task2.parser.ControlFlowGraphListener;
import tk.dadle8.program.models.verification.task1.util.ParserUtils;

import java.io.IOException;

public class Task2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Task2");

        ParserUtils parserUtils = new ParserUtils();

        ProLangLexer lexer = new ProLangLexer(CharStreams.fromStream(parserUtils.getFile("text.txt")));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProLangParser parser = new ProLangParser(tokens);
        ParseTree tree = parser.source();

        ControlFlowGraphListener listener = new ControlFlowGraphListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        parserUtils.writeFile(listener.toString(), "task2/out/result.txt");
    }
}