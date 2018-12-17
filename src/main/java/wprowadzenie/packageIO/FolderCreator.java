package wprowadzenie.packageIO;

import java.io.File;

public class FolderCreator {

   public boolean folderCreator(String path){
      return new File(path).mkdir();
   }
}
