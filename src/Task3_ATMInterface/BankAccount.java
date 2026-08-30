package Task3_ATMInterface;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {

        if (amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }
}
