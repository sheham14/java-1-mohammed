package Midterm;

/**
 * CP2280 Midterm
 *
 * Application for making sure your Rectangle class is built according to the instructions
 *
 * Note: if this class doesn't find your Course class then you may want to create a new
 * version of this class inside your project and copy paste all this text in to ensure you are in the
 * right project.
 *
 *
 */
public class FunWithRectangles {

    public static void main(String[] args) {
        System.out.println("Fun with Rectangles on a Midterm! Yay!");

        //TODO you need to create a Rectangle class. Make sure it's in the same project and default package

        //Create a simple rectangle
        Rectangle rectangle = new Rectangle(4.0, 2.0);
        Rectangle square = new Rectangle(4.0, 4.0);
        Rectangle negativeLength = new Rectangle(-4.0, 4.0);
        Rectangle negativeWidth = new Rectangle(4.0, -2.0);


        //Print out a rectangle's information
        printRectangleInfo(rectangle);
        printRectangleInfo(square);
        printRectangleInfo(negativeLength);
        printRectangleInfo(negativeWidth);



        //TODO consider writing more tests to make sure you met all the requiremints

    }

    public static void printRectangleInfo(Rectangle rectangle){
        System.out.printf("Length: %f, Width: %f, area: %f, perimeter: %f, square? %b\n",
                rectangle.getLength(), rectangle.getWidth(), rectangle.area(), rectangle.perimeter(), rectangle.isSquare());
    }

}
