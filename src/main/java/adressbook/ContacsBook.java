package adressbook;

import java.util.ArrayList;
import java.util.List;

public class ContacsBook {
    List<Contact> contactList = new ArrayList<>();

    public List<Contact> getContactList() {
        return contactList;
    }

    public void addContact(JSONConverter converter){
        contactList.add(converter.readFromFile());
    }

}
