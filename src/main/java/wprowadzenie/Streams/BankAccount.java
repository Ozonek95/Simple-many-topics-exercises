package wprowadzenie.Streams;

public class BankAccount {
    private String name;
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
        this.name = "Bank z "+balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
