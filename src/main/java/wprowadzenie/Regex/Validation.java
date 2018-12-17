package wprowadzenie.Regex;

import java.time.Month;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public boolean checkIfInputIsNumber(String input){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            System.out.println("Match !");
            int number = Integer.parseInt(input);
            if(number%2==0){
                System.out.println("Number is even");
            }
            else {
                System.out.println("Number is odd");
            }
            return true;
        }
        else {
            System.out.println("No match");
            return false;
        }

    }

    public  boolean checkIfThisPostNumber(String input){
        Pattern pattern = Pattern.compile("\\d{2}-\\d{3}");
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            System.out.println("Your post number is valid");
            return true;
        }
        return false;
    }

    public boolean checkIfPasswordIsCorrect(String input){
        Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).{8,16}");
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            System.out.println("Correct password!");
            return true;
        }
        else {
            System.out.println("Invalid password.");
            return false;
        }
    }

    public boolean checkIfInputContainsAlaWord(String input){
        Pattern pattern = Pattern.compile("(.*\\s)?(ala)(\\s+.*)?");
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            return true;
        }
        return false;
    }

    public boolean checkIfSerialNumberIsCorrect(String input){
       Pattern pattern = Pattern.compile("[A-Z]{3}\\d{5}[a-z][A-Z]");
       Matcher matcher = pattern.matcher(input);
       if(matcher.matches()){
           return true;
       }
       return false;
    }

    public boolean checkIfSoftwareSerialNumberIsCorrect(String input){
        String[] inputs = input.split("-");
        if(inputs.length!=5){
            System.out.println("Bad number");
            return false;

        }
        Pattern pattern = Pattern.compile("((?=.*[A-Z])(?=.*\\d)(?!.*[^A-Z0-9&#$%]).{5})");
        Matcher matcher;
        for (String s:inputs) {
           matcher = pattern.matcher(s);
           if(!matcher.matches()){
               System.out.println("Bad number");
               return false;
           }
        }
        System.out.println("Great !");
        return true;

    }
    public boolean checkIfSoftwareSerialNumberIsCorrect2(String input){
        Pattern pattern = Pattern.compile("([A-Z0-9&]{5}-){4}[A-Z0-9&]{5}");
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            return true;
        }
        return false;
    }

    public boolean checkIfFVIsCorrect(String input) {
        Pattern pattern = Pattern.compile("FV/1[0-9]{3}/[0-1][0-9]/\\d+");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
    public void givePESELInformation(String input){
        Pattern pattern = Pattern.compile("([0-9]{2})([0-9]{2})([0-3][0-9])([0-9]{4})([0-9])");
        Matcher matcher = pattern.matcher(input);
        matcher.matches();
        String year="";


        int month = Integer.parseInt(matcher.group(2));
        if(month>80){
            year="rok 18"+matcher.group(1);
            month=month-80;
        }
        else if(month>=61&&month<81){

            year="rok 22"+matcher.group(1);
            month=month-60;
        }
        else if(month>=40&&month<61){

           year="rok 21"+matcher.group(1);
            month=month-40;
        }
        else if(month<40&&month>=21){

            year="rok 20"+matcher.group(1);
            month=month-20;
        }
        else if(month<=12){

            year="rok 19"+matcher.group(1);
        }



        System.out.println(year);

        System.out.println("Miesiąc: "+Month.of(month));

        System.out.println("Dzień: "+matcher.group(3));

        System.out.println("Numer serii: "+matcher.group(4));

        int checkSex = Integer.parseInt(matcher.group(4));
        if(checkSex%2==0){
            System.out.println("Płeć: F");
        }
        else System.out.println("Płeć: M");

        System.out.println("Cyfra kontrolna: "+matcher.group(5));


    }

}
