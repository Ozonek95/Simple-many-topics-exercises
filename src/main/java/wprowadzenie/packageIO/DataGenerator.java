package wprowadzenie.packageIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {

    public void generateData(String direction, int personToCreate) {

        Random random = new Random();
        UserFileReader userFileReader = new UserFileReader();
        List<String> manNames = userFileReader.readFile("C:\\Users\\kacpe\\Desktop\\im_meskie.txt");
        List<String> womanNames = userFileReader.readFile("C:\\Users\\kacpe\\Desktop\\im_zenskie.txt");
        List<String> manSurnames = userFileReader.readFile("C:\\Users\\kacpe\\Desktop\\nazwiska_meskie.txt");
        List<String> womanSurnames = userFileReader.readFile("C:\\Users\\kacpe\\Desktop\\nazwiska_zenskie.txt");
        List<String> cities = userFileReader.readFile("C:\\Users\\kacpe\\Desktop\\miejscowosci.txt");
        List<String> streets = userFileReader.readFile("C:\\Users\\kacpe\\Desktop\\ulice.txt");

        StringBuilder sb = new StringBuilder();

        List<List<String>> namesList = new ArrayList<>();
        List<String> surnames;
        namesList.add(manNames);
        namesList.add(womanNames);
        for (int i = 0; i < personToCreate; i++) {

            int randomNameList = random.nextInt(2);

            List<String> randomName = namesList.get(randomNameList);
            if (randomName.equals(manNames)) {
                surnames = manSurnames;
            } else {
                surnames = womanSurnames;
            }

            sb.append(randomName.get(0 + (int) (Math.random() * ((randomName.size() - 1) + 1))))
                    .append(" ")
                    .append(surnames.get(0 + (int) (Math.random() * ((surnames.size() - 1) + 1))))
                    .append(" ")
                    .append(cities.get(0 + (int) (Math.random() * ((cities.size() - 1) + 1))))
                    .append(" ")
                    .append(streets.get(0 + (int) (Math.random() * ((streets.size() - 1) + 1))))
                    .append(System.getProperty("line.separator"))
                    .append(System.getProperty("line.separator"));
        }

        FileCreator fileCreator = new FileCreator();
        fileCreator.createFileAndWrite(direction, sb.toString());

    }
}
