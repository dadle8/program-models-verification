package tk.dadle8.program.models.verification;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tk.dadle8.antlr4.Task1BaseListener;
import tk.dadle8.antlr4.Task1Lexer;
import tk.dadle8.antlr4.Task1Parser;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Task1");


        Task1Lexer lexer = new Task1Lexer(CharStreams.fromString("function test(first, second) end function"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Task1Parser parser = new Task1Parser(tokens);
        ParseTree tree = parser.source();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Task1BaseListener(), tree);
    }
}