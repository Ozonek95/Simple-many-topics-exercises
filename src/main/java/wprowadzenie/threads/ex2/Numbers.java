package wprowadzenie.threads.ex2;

import java.util.concurrent.CopyOnWriteArrayList;

public class Numbers {

    private CopyOnWriteArrayList<Integer> numbers;

    public Numbers() {
        numbers = new CopyOnWriteArrayList<>();
    }

    public CopyOnWriteArrayList<Integer> getNumbers() {
        return numbers;
    }
}
