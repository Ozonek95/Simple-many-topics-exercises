package wprowadzenie.Streams;

public class StringUtils {
    public static String betterString(String s1, String s2, StringInterface s) {
     if(s.method(s1,s2)){
         return s1;
     }
     else return s2;
    }
}
