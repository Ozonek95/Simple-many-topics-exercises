package parking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello on our parking!");
        Parking parking = new Parking(5);
       while (true){

           parking.menu(new Scanner(System.in));
       }

    }
}
