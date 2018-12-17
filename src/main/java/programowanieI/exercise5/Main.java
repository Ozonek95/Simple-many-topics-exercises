package programowanieI.exercise5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> values = new TreeMap<>();
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(201);
            if (!values.containsKey(number)) {
                values.put(number, 1);
            } else {
                values.replace(number, values.get(number) + 1);
            }
        }


        for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
            System.out.println("Key :" + entry.getKey() + " value: " + entry.getValue());
        }


        System.out.println();

        Collection<Integer> readyValues = values.values();

        List<Integer> num = values.entrySet()
                .stream()
                .sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                .map(entry -> entry.getKey())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(num);
        //w sumie zle
//        List<Integer> fiveValues =
////                readyValues.stream().sorted((s1, s2) -> Long.compare(s2, s1)).limit(5).collect(Collectors.toList());
////
////        List<Integer> finalValues = new ArrayList<>();
////        for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
////            int key = entry.getKey();
////            int val = entry.getValue();
////
////            if (fiveValues.contains(val)) {
////                finalValues.add(key);
////            }
////
////        }
////
////        finalValues.sort((s1, s2) -> Long.compare(s2, s1));
////        finalValues.stream().limit(5).forEach(s -> System.out.println(s));
////
////
////    }
    }
}



