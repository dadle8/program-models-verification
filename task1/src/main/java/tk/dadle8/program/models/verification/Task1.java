package tk.dadle8.program.models.verification;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Trees;
import tk.dadle8.antlr4.ProLangLexer;
import tk.dadle8.antlr4.ProLangParser;
import tk.dadle8.program.models.verification.parser.SpecificListener;
import tk.dadle8.program.models.verification.parser.TreeUtils;

import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Task1");

        ProLangLexer lexer = new ProLangLexer(CharStreams.fromString("function test(first, second) if a > b then a = c; end if end function"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProLangParser parser = new ProLangParser(tokens);
        ParseTree tree = parser.source();
        ParseTreeWalker walker = new ParseTreeWalker();
        SpecificListener listener = new SpecificListener(parser);
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        System.out.println(listener.toString());

//        System.out.println(TreeUtils.toPrettyTree(tree, List.of(parser.getRuleNames())));

//        System.out.println(Trees.toStringTree(tree, parser));
    }
}