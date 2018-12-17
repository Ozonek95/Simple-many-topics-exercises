package wprowadzenie.lotto;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lotto2 {
    public static void main(String[] args) {

       // solution 1
        List<Integer> list = new ArrayList<>();

        IntStream.generate(()->new Random().nextInt(50)+1).limit(100).forEach(s->{
            if(!list.contains(s)&&list.size()<6){
                list.add(s);
            }
        });

        for (int i:list) {
            System.out.println(i);
        }



//solution 2

        System.out.println();
        System.out.println("Solution 2");
        System.out.println();
        List<Integer> numbers =
                 IntStream.range(1,50).boxed().collect(Collectors.toList());
        Collections.shuffle(numbers);
        numbers.stream().limit(6).forEach(System.out::println);

        //solution 3
        System.out.println("solution 3");

        new Random().ints(6,1,49).forEach(System.out::println);

        System.out.println("XXXXXXXX");



        //LOTTO NEXT EXAMPLE
        Stream.of(new Random().ints(6,1,50)
                .boxed()
                .collect(Collectors.toList()))
                .forEach(System.out::println);



        //ex31

        System.out.println("Ex 31");


        new Random().ints(10,0,100)
                .map(n->n*2)
                .forEach(s-> System.out.println(s/2+" "+s));

        Stream.of(new Random().ints(10,1,101)
                .boxed()
                .map(s->s*2)
                .collect(Collectors.toList()))
                .forEach(s-> s.forEach(b-> System.out.println(b/2+" "+b)));


        System.out.println("ex 32");

        int[] numbs = new int[20];

        Random random = new Random();

        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = random.nextInt(101)+100;
        }

       int[]newNumbs = IntStream.of(numbs)
               .boxed()
               .sorted(Comparator.reverseOrder())
               .mapToInt(i->i)
               .toArray();

        for (int numb : numbs) {
            System.out.println(numb);
        }

        System.out.println();
        System.out.println("Sorted Descending");
        System.out.println();
        for (int numb : newNumbs) {
            System.out.println(numb);
        }








    }









}
