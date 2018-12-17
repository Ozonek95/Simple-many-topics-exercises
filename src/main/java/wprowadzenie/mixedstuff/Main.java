package wprowadzenie.mixedstuff;

public class Main {
    public static void main(String[] args) {


        Clipboard<BasePerson> clipboard = new Clipboard<>();
        clipboard.insertInto(new Employee());
        clipboard.insertInto(new BasePerson());
        clipboard.insertInto(new Teacher());


        clipboard.getList().forEach(System.out::println);


    }
}
