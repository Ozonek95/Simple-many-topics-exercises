package wprowadzenie.Streams;

import java.util.*;

public class MainEx1 {
    public static void main(String[] args) {
        List<BankAccount> banks = new ArrayList<>();

        BankAccount bankAccount1 = new BankAccount(1000);
        BankAccount bankAccount2 = new BankAccount(2000);
        BankAccount bankAccount3 = new BankAccount(3000);
        BankAccount bankAccount4 = new BankAccount(4000);
        BankAccount bankAccount5 = new BankAccount(5000);
        BankAccount bankAccount6 = new BankAccount(7500);
        BankAccount bankAccount7 = new BankAccount(10000);

        banks.add(bankAccount1);
        banks.add(bankAccount2);
        banks.add(bankAccount3);
        banks.add(bankAccount4);
        banks.add(bankAccount5);
        banks.add(bankAccount6);
        banks.add(bankAccount7);

        Comparator comparator = new BankCompare();


       BankAccount aaa = biggestAccount(banks,comparator);
        System.out.println(aaa.toString());


    }

    public static BankAccount biggestAccount(List<BankAccount> banks, Comparator c){
        Optional<BankAccount> biggest = banks.stream().max(c);

        if(biggest.isPresent()){
            return biggest.orElse(new BankAccount(2));
        }
        return null;

    }
}
