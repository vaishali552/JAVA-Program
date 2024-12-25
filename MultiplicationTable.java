package JavaPackage;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a number between 1 and 10 to see its multiplication table:");
        int number = scanner.nextInt();

        // Validate the input
        if (number < 1 || number > 10) {
            System.out.println("Invalid input! Please enter a number between 1 and 10.");
        } else {
            // Print the multiplication table for the selected number
            System.out.println("Multiplication Table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

        // Close the scanner
        scanner.close();
    }
}
