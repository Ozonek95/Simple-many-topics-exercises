package wprowadzenie.Streams;

public class MainEx2 {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "testtest";
        String longer = StringUtils.betterString(s1,s2,(st1,str2)->st1.length()>str2.length());
        String first = StringUtils.betterString(s1,s2,(str1,str2)->true);

        System.out.println(longer);
        System.out.println(first);
    }
}
