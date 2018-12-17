package wprowadzenie.Testing;

import java.util.Arrays;
import java.util.List;

public class LettersCounter {


   private final List<Character> lettersA = Arrays.asList('a','ą','e','ę','i','o','u','y');
   private final List<Character> lettersB = Arrays.asList('b','d','g','h','j','k','p','t','w','z','c');

    public int numberOfA(String name) {
        name=name.toLowerCase();
        int number = 0;
        if(name.length()>0){
            for (int i = 0; i < name.length() ; i++) {
                if(lettersA.contains(name.charAt(i))){
                    number++;
                }
            }
            System.out.println(number);
        }
        return number;
    }

    public int numberOfB(String name) {
        name=name.toLowerCase();
        int number = 0;
        if(name.length()>0){
            for (int i = 0; i < name.length() ; i++) {
                if(lettersB.contains(name.charAt(i))){
                    number++;
                }
            }
            System.out.println(number);
        }
        return number;
    }
}
