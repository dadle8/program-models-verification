package tk.dadle8.program.models.verification.task1.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class ParserUtils {

    public InputStream getFile(String name) {
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResourceAsStream(name);
    }

    public void writeFile(String text, String pathToFile) {
        try(FileWriter writer = new FileWriter(pathToFile, false))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
