package programowanieI.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(random.nextInt(1000)+1000);
        }

        int min = numbers.stream()
                .min((n1,n2)->n1.compareTo(n2))
                .get();

        int max = numbers.stream()
                .min((n2,n1)->n1.compareTo(n2))
                .get();

        System.out.println(min+" "+max);
    }
}
