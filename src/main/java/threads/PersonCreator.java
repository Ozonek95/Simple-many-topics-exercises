package threads;

import com.fasterxml.jackson.databind.ObjectMapper;
import toStringExercise.Person;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class PersonCreator implements Runnable{
    @Override
    public void run() {

        ObjectMapper mapper = new ObjectMapper();
        DataStorage dataStorage = new DataStorage();
        try {
            System.out.println("Starting thread "+Thread.currentThread().getName());
            mapper.writeValue(new File("C:\\Users\\kacpe\\Desktop\\JsonJava\\"+dataStorage.getPaths()
                    .get(new Random().nextInt(dataStorage.getPaths().size()))),generatePerson(dataStorage));
            System.out.println("Finished thred "+Thread.currentThread().getName());
            Thread.sleep(1500);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



    public PersonThreads generatePerson(DataStorage dataStorage) {
        Random random = new Random();
        String name = dataStorage.getNames().get(random.nextInt(dataStorage.getNames().size()));
        String surname = dataStorage.getSurnames().get(random.nextInt(dataStorage.getSurnames().size()));
        int age = random.nextInt(100)+1;
        PersonThreads personThreads = new PersonThreads(name,surname,age);
        return personThreads;
    }
}
