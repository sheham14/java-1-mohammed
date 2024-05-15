package ca.nl.cna.sheham.assignments.Fall2023.examples;

import java.util.Scanner;

public class FunWithSavingsAccount {

    public static void main(String[] args) {
        System.out.println("Fun with Savings Account");

        SimpleSavingsAccount savingsAccount = new SimpleSavingsAccount("Sheham Mohammed");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount to deposit: ");
        double amount = input.nextDouble();
        savingsAccount.deposit(amount);

        System.out.printf("Account name: %s\n",
        savingsAccount.getName());

        System.out.printf("Savings Balance: %.2f",
                savingsAccount.getBalance());



    }
}
