package wprowadzenie.threads.ex2;

public class NumbersSumator implements Runnable {

    NumbersQueue numbersQueue;

    public NumbersSumator(NumbersQueue numbers) {
        this.numbersQueue = numbers;
    }

    @Override
    public void run() {
        while (true){
            showSum();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public  void showSum(){
        Numbers numbers = numbersQueue.getNumbersQueue().poll();
        if(numbers!=null){
        int a=numbers.getNumbers().get(0);
        int b=numbers.getNumbers().get(1);

        System.out.println(a+b);}
    }
}
