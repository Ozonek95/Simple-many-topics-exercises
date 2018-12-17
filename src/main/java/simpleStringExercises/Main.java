package simpleStringExercises;

public class Main {
    public static void main(String[] args) {

        System.out.println(Main.reverseString("Aligator"));
    }
    public static String reverseString(String input){
        String output = "";

        char[] chars = input.toCharArray();

        for (int i = (chars.length-1); i >= 0; i--) {

            output += chars[i];
        }

        return output;
    }
}
