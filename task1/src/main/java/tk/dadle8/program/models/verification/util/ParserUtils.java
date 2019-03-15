package tk.dadle8.program.models.verification.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class ParserUtils {

    public InputStream getFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResourceAsStream("text.txt");
    }

    public void writeFile(String text) {
        try(FileWriter writer = new FileWriter("task1/out/result.txt", false))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
