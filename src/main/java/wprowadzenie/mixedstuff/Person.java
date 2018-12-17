package wprowadzenie.mixedstuff;

public class Person {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String sex;
    private String pesel;

    public Person(String name, String surname, String dateOfBirth, String sex, String pesel) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.pesel = pesel;
    }

    public void presentate(){
        String printSex="";
        if(sex.equals("M")){
            printSex="mężczyzna urodzony ";
        }
        else {
            printSex="kobieta urodzona ";
        }
        System.out.println("Wyświetlana osoba to "+name+" "+surname+", "+printSex+dateOfBirth+" o PESEL-u "+pesel);
    }
}
