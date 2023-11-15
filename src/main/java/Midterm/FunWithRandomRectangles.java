package Midterm;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * A class that uses a for loop to generate 10 rectangles with random sides and lengths between 1 and 10.
 * It prints the info of the rectangle.
 * When there is a rectangle with equal sides it prints "WINNER! RANDOM SQUARE!".
 */
public class FunWithRandomRectangles {
    public static void main(String[] args) {
        System.out.println("Fun with Random Rectangles!");

        for (int i = 1; i < 11; i++){
            int min = 1;
            int max = 10;
            int randomLength = ThreadLocalRandom.current().nextInt(min, max + 1);
            int randomWidth = ThreadLocalRandom.current().nextInt(min, max + 1);
            Rectangle rectangle = new Rectangle((double) randomLength, (double) randomWidth);
            FunWithRectangles.printRectangleInfo(rectangle);
            if(rectangle.isSquare()){
                System.out.println("WINNER! RANDOM SQUARE!");
            }
        }
    }
}
