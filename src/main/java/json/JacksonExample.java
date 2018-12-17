package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JacksonExample {
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();

        User user = createDummyUser();

        try {
            objectMapper.writeValue(new File("C:\\Users\\kacpe\\Desktop\\JsonExample.json"),user);

            String jsonInString = objectMapper.writeValueAsString(user);
            System.out.println(jsonInString);

             jsonInString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            System.out.println(jsonInString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        User userFromJSON=null;

        try {
           userFromJSON  = objectMapper.readValue(new File("C:\\Users\\kacpe\\Desktop\\JsonExample.json"),User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(userFromJSON.getName()+" "+userFromJSON.getAge());




    }

    private static User createDummyUser() {
        User user = new User();

        user.setName("Kacper");
        user.setAge(23);

        List<String> msg = new ArrayList<>();
        msg.add("MSG1");
        msg.add("MSG2");
        msg.add("MSG3");

        user.setMessages(msg);

        return user;
    }
}
