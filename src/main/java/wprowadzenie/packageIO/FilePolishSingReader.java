package wprowadzenie.packageIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilePolishSingReader {
    public List<String> readFile(String path){
        try {
            List<String> output = new ArrayList<>();
            String line ="";
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF8"));
            while ((line = (bufferedReader.readLine()))!=null){
                output.add(line);
            }
            return output;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("BAD OPERATION");
    }
}
