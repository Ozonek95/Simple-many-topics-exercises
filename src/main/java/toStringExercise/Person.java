package toStringExercise;

public class Person {
    private String name;
    private String surname;
    private String pesel;

    public Person(String name, String surname, String pesel){
        this.name=name;
        this.surname=surname;
        this.pesel=pesel;
    }

    @Override
    public String toString(){

        return String.format("Imię: %s, Nazwisko: %s, Pesel: %s",name,surname,pesel);
    }
}
