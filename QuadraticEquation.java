package JavaPackage;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter coefficients a, b, and c
        System.out.print("Input a: ");
        double a = scanner.nextDouble();

        System.out.print("Input b: ");
        double b = scanner.nextDouble();

        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check the nature of the roots
        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            // No real roots
            System.out.println("The equation has no real roots.");
        }

        // Close the scanner
        scanner.close();
    }
}
