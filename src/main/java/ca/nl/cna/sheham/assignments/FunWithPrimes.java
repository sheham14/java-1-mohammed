package ca.nl.cna.sheham.assignments;
import java.util.Scanner;
public class FunWithPrimes {
    public static void main(String[] args) {
        System.out.println("""
                Lets have fun with primes!
                \n
                1. Print prime numbers\s
                2. Print primes between numbers\s
                3. Print UPF of a number\s
                4. Print UPF of numbers upto a limit\s""");

        Scanner input = new Scanner(System.in);

        System.out.println("\nChoose option: ");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("Enter number: ");
            int number = input.nextInt();
            for (int i = 2; i <= number; i++){

                if (new PrimeNumberCalculator(i).isPrime()){
                    System.out.println(i);
                }
            }

        } else if(option == 2) {
            System.out.println("Enter starting number: ");
            int startNum = input.nextInt();
            System.out.println("Enter ending number: ");
            int endNum = input.nextInt();
            for (int i = startNum; i <= endNum; i++){

                if (new PrimeNumberCalculator(i).isPrime()){
                    System.out.println(i);
                }

            }


        } else if(option == 3) {
            System.out.println("Enter number: ");
            int number = input.nextInt();
            System.out.println(new PrimeNumberCalculator(number).getUniquePrimeFactorization());

        } else if(option == 4) {
            System.out.println("Enter number: ");
            int number = input.nextInt();
            for (int i = 1; i <= number; i++){
               System.out.println(new PrimeNumberCalculator(i).getUniquePrimeFactorization());
            }
        }


    }

}
