package adressbook;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactBookController {
    private ContacsBook contacsBook = new ContacsBook();
    private JSONConverter jsonConverter = new JSONConverter("C:\\Users\\kacpe\\Desktop\\adressbook.json");
    Scanner scanner = new Scanner(System.in);



    public void addContact(String name, String surname, String phoneNumber, String emailAdress){
        jsonConverter.setContact(new Contact(name,surname,phoneNumber,emailAdress));
        jsonConverter.writeToFile();
        contacsBook.addContact(jsonConverter);
    }

    public void askForWhatToSearchOn(){
        System.out.println("Search by name: 1");
        System.out.println("Search by surname: 2");
        System.out.println("Search by email: 3");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                showResultsByName();
                break;
            case 2:
                showResultsBySurname();
                break;
            case 3:
                showResultsByEmail();
                break;
                default:
                    searchByEverything();
        }

    }

    public void showResultsByName(){
        System.out.println("Provide input");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(input);
        for (Contact c:contacsBook.getContactList()) {
            Matcher matcher = pattern.matcher(c.getName());
            if(matcher.find()){
                System.out.println(c);
            }
        }


    }

    public void showResultsBySurname(){
        System.out.println("Provide input");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(input);
        for (Contact c:contacsBook.getContactList()) {
            Matcher matcher = pattern.matcher(c.getSurname());
            if(matcher.find()){
                System.out.println(c);
            }
        }
    }

    public void showResultsByEmail(){
        System.out.println("Provide input");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(input);
        for (Contact c:contacsBook.getContactList()) {
            Matcher matcher = pattern.matcher(c.getEmailAdress());
            if(matcher.find()){
                System.out.println(c);
            }
        }
    }

    public void searchByEverything(){
        System.out.println("Provide input");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(input);
        for (Contact c:contacsBook.getContactList()) {
            Matcher matcher = pattern.matcher(c.toString());
            if(matcher.find()){
                System.out.println(c);
            }
        }
    }
}
