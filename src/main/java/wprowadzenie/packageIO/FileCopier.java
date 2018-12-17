package wprowadzenie.packageIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileCopier {
    public void cloneFile(String fileToCopy, String destination){

        Scanner scanner = new Scanner(System.in);
        Path path1 = Paths.get(fileToCopy);
        Path path2 = Paths.get(destination);
        System.out.println("Do You want to delete file? [y/n]");
        String choice = scanner.nextLine();


        if(choice.equals("y")){
            try {
                Files.move(path1,path2,StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(choice.equals("n")) {
            try {
                Files.copy(path1,path2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scanner.close();

    }
}
