package ca.nl.cna.sheham.assignments;
import java.util.Scanner;
public class FunWithPrimes {
    public static void main(String[] args) {
        System.out.println("Lets have fun with primes!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = input.nextInt();

        PrimeNumberCalculator prime = new PrimeNumberCalculator(number);
        System.out.println(prime.getUniquePrimeFactorization());

    }


}
