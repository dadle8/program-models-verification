package tk.dadle8.program.models.verification.task1.util;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.Parser;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangBaseListener;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangLexer;
import tk.dadle8.program.models.verification.task1.antlr4.ProLangParser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class ParserUtils {

    public InputStream getFile(String name) {
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResourceAsStream(name);
    }

    public void writeFile(String text, String pathToFile) {
        try (FileWriter writer = new FileWriter(pathToFile, false)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public ProLangParser getParseTreeFromFile(String fileFrom) {
        ProLangParser parser = null;
        try {
            ProLangLexer lexer = new ProLangLexer(CharStreams.fromStream(this.getFile(fileFrom)));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new ProLangParser(tokens);
        } catch (IOException exc) {
            exc.getStackTrace();
        }
        return parser;
    }
}
