package ca.nl.cna.sheham.assignments.Assignment3;
import java.util.Scanner;
public class FunWithLoops2 {
    public static void main(String[] args) {
        System.out.println("Fibonacci Sequence");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter limit: ");
        int limit = input.nextInt();

        int i = 0;
        int j = 1;
        int k =  i + j;
        System.out.print("0, 1, ");

        while(k <= limit) {
            System.out.printf("%d, ", k);
            i = j;
            j = k;
            k = i + j;
        }
        System.out.printf("%d", k);
    }
}
