package wprowadzenie.threads.ex2;



public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        NumbersQueue numbersQueue = new NumbersQueue();
        NumberProvider numberProvider = new NumberProvider(numbersQueue);
        NumbersSumator numbersSumator = new NumbersSumator(numbersQueue);
        Thread t1 = new Thread(numberProvider);
        Thread t2 = new Thread(numbersSumator);
        t1.start();
        t2.start();
    }
}
