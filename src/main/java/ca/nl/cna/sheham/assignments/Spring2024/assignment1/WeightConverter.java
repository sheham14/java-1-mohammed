package ca.nl.cna.sheham.assignments.Spring2024.assignment1;

public class WeightConverter {

    public static double poundsToKilos(double pounds) {
        assert pounds > 0 : "Weight must be greater than 0";
        return pounds * 0.45359237;
    }

    public static double kilosToPounds(double kilos) {
        assert kilos > 0 : "Weight must be greater than 0";
        return kilos / 0.45359237;
    }

    public static void main(String[] args) {

        double pounds = 150.0;
        double kilos = 100.0;

        System.out.println("150 pounds to kilos: " + poundsToKilos(pounds));
        System.out.println("100 kilos to pounds: " + kilosToPounds(kilos));


        try {
            pounds = -10.0;
            poundsToKilos(pounds);
        } catch (AssertionError e) {
            System.out.println("Caught assertion error: " + e.getMessage());
        }
    }
}
