package JavaPackage;

public class PrimeNumber {
	public static void main(String[] args) {
        int limit = 50; // Define the range limit for prime numbers
        int num = 2; // Start checking for primes from 2

        System.out.println("Prime numbers between 1 and " + limit + ":");

        while (num <= limit) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        int i = 2;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself
            }
            i++;
        }
        return true; // If no divisors found, the number is prime
    }
}

