package wprowadzenie.packageIO;

import java.io.File;
import java.util.Scanner;

public class FileDeleter {
    public void deleteFile(String path){
        Scanner scanner = new Scanner(System.in);
        File file = new File(path);
        if(file.exists()){
            System.out.println("Are You shure you want to delete "+file.getName()+"?");
            String choice = scanner.nextLine();
            if(choice.equals("y")){
                file.delete();
            }
            else System.out.println("Your file is safe");


        }
    }
}
