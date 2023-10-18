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
        int i = 2;
        String upf = upf = " ";
        if (isPrime() == true) {
            upf += number + "*1";
        } else {

            while(number > 1){

                if(number % i == 0){
                    upf += i;
                    number = number/i;
                    if (number > 1){
                        upf += "*";
                    }
                } else {
                    i++;
                }
            }

            }
        return upf;
    }
}