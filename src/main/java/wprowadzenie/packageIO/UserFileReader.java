package wprowadzenie.packageIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class UserFileReader {

    public List<String> readFile(String path){
        Path bigPath =Paths.get(path);
       try { List<String> lines = Files.readAllLines(bigPath);
           return lines;

       } catch (IOException e) {
           e.printStackTrace();
       }

        throw new IllegalArgumentException("Cant read file");

    }
}
