package JavaPackage;
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Input the number
            System.out.println("Enter a number (or type -1 to exit):");
            int number = scanner.nextInt();

            // Exit condition
            if (number == -1) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            // Check if the number is prime
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false; // Numbers less than or equal to 1 are not prime
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false; // Found a divisor, not a prime number
                        break;
                    }
                }
            }

            // Output the result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}