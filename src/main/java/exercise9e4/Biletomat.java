package exercise9e4;

import java.util.Scanner;

public class Biletomat {
    public static void pay(Scanner scanner){
        StringBuilder builder = new StringBuilder();
        System.out.println("How many tickets?");
        int tickets = Integer.parseInt(scanner.nextLine());
        int sum = tickets*Ticket.getPrice();
        System.out.println("Pay "+sum);
        int moneyFromClient = Integer.parseInt(scanner.nextLine());
        int moneyToGiveBack = moneyFromClient-sum;
        System.out.println("Your rest is "+ moneyToGiveBack);
        if(moneyToGiveBack>200){
            builder.append("You have "+moneyToGiveBack/200+" 200, ");
            moneyToGiveBack=moneyToGiveBack%200;
        }
        if(moneyToGiveBack>100){
            builder.append(moneyToGiveBack/100+" 100, ");
            moneyToGiveBack=moneyToGiveBack%100;
        }
        if(moneyToGiveBack>50){
            builder.append(moneyToGiveBack/50+" 50, ");
            moneyToGiveBack=moneyToGiveBack%50;
        }
        if(moneyToGiveBack>20){
            builder.append(moneyToGiveBack/20+" 20, ");
            moneyToGiveBack=moneyToGiveBack%20;
        }
        if(moneyToGiveBack>10){
            builder.append(moneyToGiveBack/10+" 10, ");
            moneyToGiveBack=moneyToGiveBack%10;
        }
        if(moneyToGiveBack>5){
            builder.append(moneyToGiveBack/5+" 5, ");
            moneyToGiveBack=moneyToGiveBack%5;
        }
        if(moneyToGiveBack>2){
            builder.append(moneyToGiveBack/2+" 2, ");
            moneyToGiveBack=moneyToGiveBack%2;
        }
        if(moneyToGiveBack==1){
            builder.append(1+" one dolar");
        }
        System.out.println(builder);


    }
}
