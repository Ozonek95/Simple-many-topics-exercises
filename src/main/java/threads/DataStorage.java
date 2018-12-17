package threads;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    private List<String> names = new ArrayList<>();
    private List<String> surnames = new ArrayList<>();
    private   List<String> paths = new ArrayList<>();


    public DataStorage() {
        names.add("Ada <3");
        names.add("Kacpi");
        names.add("Ala");
        names.add("Ola");
        names.add("Remik");
        names.add("Kamil");
        names.add("Daria");
        names.add("Renia");
        names.add("Tusio");

        surnames.add("Nazwisko1");
        surnames.add("Nazwisko2");
        surnames.add("Nazwisko3");
        surnames.add("Nazwisko4");
        surnames.add("Nazwisko5");
        surnames.add("Nazwisko6");
        surnames.add("Nazwisko7");
        surnames.add("Nazwisko8");
        surnames.add("Nazwisko9");
        surnames.add("Nazwisko10");

        paths.add("json1.json");
        paths.add("json2.json");
        paths.add("json3.json");
        paths.add("json4.json");
        paths.add("json5.json");
    }

    public List<String> getNames() {
        return names;
    }

    public List<String> getSurnames() {
        return surnames;
    }

    public List<String> getPaths() {
        return paths;
    }
}
