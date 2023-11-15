package Midterm;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * An application class that simulates the roll of a die with either 6, 10, or 20 sides.
 */
public class FunWithDice {
    public static void main(String[] args) {
        System.out.println("Lets have fun with Dice!");

        Scanner input = new Scanner(System.in);
        char c;

        do {
            System.out.printf("""
                    \uF0B7 [A] Roll a 6 sided die
                    \uF0B7 [B] Roll a 10 sided die
                    \uF0B7 [C] Roll a 20 sided die
                    \uF0B7 [Q] Quit
                    Enter choice:""");

            c = Character.toUpperCase(input.next().charAt(0));

            if (c == 'A') {
                int min = 1;
                int max = 6;
                int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                System.out.println(randomNum + "\n");
            } else if (c == 'B') {
                int min = 1;
                int max = 10;
                int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                System.out.println(randomNum + "\n" );

            } else if (c == 'C') {
                int min = 1;
                int max = 20;
                int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                System.out.println(randomNum + "\n");
            }

        } while (c != 'Q');

        System.out.println("\nGoodbye!");
    }
}
