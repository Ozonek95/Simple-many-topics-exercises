package wprowadzenie.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lotto {
       public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 49; i++) {
            numbers.add(i);

        }

        for (int i = 0; i < numbers.size(); i++) {

            //System.out.println(numbers.get(i));

        }

        List<Integer> randomNumbers = new ArrayList<>();



        while (randomNumbers.size()<6){
            int rand = random.nextInt(49)+1;
            if(!randomNumbers.contains(numbers.get(rand-1))){
                randomNumbers.add(numbers.get(rand-1));
            }

        }

        System.out.println(Arrays.asList(randomNumbers));
    }

}
