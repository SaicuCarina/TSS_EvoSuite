
package demo;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Sold initial invalid");
        }

        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Suma depusa trebuie sa fie pozitiva");
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Suma retrasa trebuie sa fie pozitiva");
        }

        if (amount > balance) {
            throw new IllegalStateException(
                    "Fonduri insuficiente");
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isEmpty() {
        return balance == 0;
    }
}
