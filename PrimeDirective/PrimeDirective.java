package PrimeDirective;
import java.util.ArrayList;

class PrimeDirective {


    // Add your methods here:

    public boolean isPrime(int number) {

        /*
        Check two edge cases:
        #1) if number equals 2
        #2) if number is less than 2
         */

        // #1) Check if number equals 2
        if (number == 2) {
            return true;
        }

        // #2) Check if number is less than 2
        if (number < 2) {
            return false;
        }


        for (int i = 2; i < number; i++) {
            // Check if number is prime
            if (number % i == 0) {
                // If number is not prime, return false
                return false;
            }
        }
        // Return true if number is prime
        return true;

    }

    public ArrayList<Integer> onlyPrimes(int[] numbers)
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number: numbers)
        {
            if (isPrime(number))
            {
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args)
    {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        System.out.println(pd.onlyPrimes(numbers));
    }

}