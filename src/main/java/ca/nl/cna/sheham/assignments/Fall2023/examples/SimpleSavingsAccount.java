package ca.nl.cna.sheham.assignments.Fall2023.examples;

public class SimpleSavingsAccount {

    private final String name;

    private double balance;

    public SimpleSavingsAccount(String name) {

        this.name = name;
        this.balance = 0;

    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
}
