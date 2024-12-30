package JavaPackage;

import java.util.Scanner;

public class NumberProperties {
    public static void main(String[] args) {
    	 // Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt floating-point number
        System.out.print("Input a number: ");
        double number = scanner.nextDouble();
        System.out.println("Input value: " + number);

        // Determine if the number is zero, positive, or negative
        if (number == 0) {
            System.out.println("Zero");
        } else {
            if (number > 0) {
                System.out.print("Positive number");
            } else {
                System.out.print("Negative number");
            }

            if (Math.abs(number) < 1) {
                System.out.println(" (small)");
            } else if (Math.abs(number) > 1000000) {
                System.out.println(" (large)");
            } else {
                System.out.println();
            }
        }
       scanner.close();
    }
}
