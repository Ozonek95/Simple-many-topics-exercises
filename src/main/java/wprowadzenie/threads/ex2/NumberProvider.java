package wprowadzenie.threads.ex2;

import java.util.Random;

public class NumberProvider implements Runnable {


    NumbersQueue numbers;

    public NumberProvider(NumbersQueue numbers) {
        this.numbers = numbers;
    }

    Random random = new Random();


    @Override
    public void run() {
        while (true){
           numbersGenerator();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void numbersGenerator(){
        int a = random.nextInt(1000);
        int b = random.nextInt(1000);

        Numbers numbers = new Numbers();
        numbers.getNumbers().add(a);
        numbers.getNumbers().add(b);
        this.numbers.getNumbersQueue().add(numbers);



        System.out.println(a+" "+b);

    }
}
