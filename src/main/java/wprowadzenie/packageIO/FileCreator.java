package wprowadzenie.packageIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {

    public void createFileAndWrite(String path, String input){
        try (FileWriter fileWriter = new FileWriter(new File(path))){
            fileWriter.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
