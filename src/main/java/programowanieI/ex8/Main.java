package programowanieI.ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Employee> names = new ArrayList<>();
        names.add(new Employee("E1",2000));
        names.add(new Employee("E2",3000));
        names.add(new Employee("E3",4000));
        names.add(new Employee("E4",7000));
        names.add(new Employee("E5",8200));
        names.add(new Employee("E5",8200));

        double avarge = names.stream().mapToInt(Employee::getSalary)
                .average().getAsDouble();

        System.out.println(avarge);

        names.stream().filter(s->s.getSalary()>avarge).forEach(System.out::println);


    }
}
