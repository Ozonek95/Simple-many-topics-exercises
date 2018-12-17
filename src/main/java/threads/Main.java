package threads;

import com.fasterxml.jackson.databind.ObjectMapper;
import toStringExercise.Person;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) throws InterruptedException {
       PersonCreator personCreator = new PersonCreator();
       Thread t1 = new Thread(personCreator);
       Thread t2 = new Thread(personCreator);
       Thread t3 = new Thread(personCreator);
       Thread t4 = new Thread(personCreator);
       Thread t5 = new Thread(personCreator);

        ObjectMapper mapper = new ObjectMapper();

       t1.start();
       t1.join();
       t2.start();
       t2.join();
       t3.start();
       t3.join();
       t4.start();
       t4.join();
       t5.start();
       t5.join();

        try {
            PersonThreads p1 = mapper.readValue(new File("C:\\Users\\kacpe\\Desktop\\JsonJava\\json1.json"),PersonThreads.class);
            System.out.println(p1.getName());
            System.out.println(p1.getAge());
            System.out.println(p1.getSurname());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
