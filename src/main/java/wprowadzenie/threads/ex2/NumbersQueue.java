package wprowadzenie.threads.ex2;

import java.util.concurrent.ConcurrentLinkedQueue;

public class NumbersQueue {
    private ConcurrentLinkedQueue<Numbers> numbersQueue;

    public NumbersQueue() {
        this.numbersQueue = new ConcurrentLinkedQueue<>();
    }

    public ConcurrentLinkedQueue<Numbers> getNumbersQueue() {
        return numbersQueue;
    }
}
