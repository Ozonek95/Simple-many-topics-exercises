package wprowadzenie.mixedstuff;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<Person> MakePeople(String patch){
        List<Person> people = new ArrayList<>();
        try {

          List<String> data = Files.readAllLines(Paths.get(patch));
            for (String s:data) {
                String[] specificData = s.split("\\s");
                people.add(new Person(specificData[0],specificData[1],specificData[3],specificData[2],specificData[4]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return people;
    }


}
