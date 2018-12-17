package wprowadzenie.mixedstuff;

import java.util.ArrayList;
import java.util.List;

public class Clipboard<T extends BasePerson> {
    private List<T> list;
    private int counter;

    public Clipboard() {
        this.list = new ArrayList<>();
        counter=0;
    }

    public void insertInto(T person){
        list.add(person);
        counter++;
    }
    public T getFrom(){
        counter--;
        return list.get(counter+1);
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
