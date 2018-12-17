package adressbook;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class JSONConverter {
   private Contact contact;
   private String fileName;
    ObjectMapper objectMapper = new ObjectMapper();

    public JSONConverter(String fileName) {
        this.fileName = fileName;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    void writeToFile(){
        if(contact!=null){

            try {
                objectMapper.writeValue(new File(fileName),contact);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    Contact readFromFile(){
        try {
            return objectMapper.readValue(new File(fileName),Contact.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
