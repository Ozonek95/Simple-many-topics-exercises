package wprowadzenie.packageIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UserFileReaderWithBufferedReader {

    private Path filePath;

    public UserFileReaderWithBufferedReader(String path) {
        this.filePath = Paths.get(path);


    }

    public void readAllLines() {

        try {

            String[] objects=
                    Files.newBufferedReader(filePath)
                    .lines().toArray(String[]::new);

            for (int i = 0; i < objects.length; i++) {
                System.out.println((i+1)+". "+objects[i]);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
