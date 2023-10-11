package ca.nl.cna.sheham.assignments;

import java.util.Scanner;

public class FunWithCars {

    public static void main(String[] args) {
        System.out.println("Let’s have fun with cars");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter car make: ");
        String make = input.nextLine();

        System.out.println("Enter car model: ");
        String model = input.nextLine();

        System.out.println("Enter car year: ");
        int year = input.nextInt();

        System.out.println("Enter car value: ");
        double value = input.nextDouble();

        Car car = new Car(make, model, year, value);

        System.out.printf("Car Make: %s\n",
                car.getMake());

        System.out.printf("Car Model: %s\n",
                car.getModel());

        System.out.printf("Car Year: %s\n",
                car.getYear());

        System.out.printf("Car Value: %s\n",
                car.getValue());


    }
}
