package wprowadzenie.packageIO;

import java.io.File;

public class FolderFilesSize {
    public int folderCreator(String path){
        return new File(path).listFiles().length;
    }
}
