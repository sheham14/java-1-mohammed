package ca.nl.cna.sheham.assignments;

public class PrimeNumberCalculator {
    private int number;

    public PrimeNumberCalculator(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number <= 1) {

            return false;
        }

        if (number <= 3){
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        double sqrt = Math.sqrt(number);
        for (int i = 3; i <= sqrt; i+=2) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public String getUniquePrimeFactorization() {

        String upf = upf = "Unique Prime Factorization of " + number + " is ";
        if (isPrime() == true) {
            upf += number + "*1";
        } else {
            if (number % 2 == 0) {
                if ((number / 2) % 2 != 0) {
                    upf += "2" + "*" + number / 2;
                } else {


            }
                }



            }

        }
        return upf;
    }
}