package JavaPackage;

import java.util.Scanner;

public class TwoFour {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.println("Enter a number to check if it is divisible by both 2 and 4:");
	        int number = scanner.nextInt();

	        // Check TwoFour
	        if (number % 2 == 0 && number % 4 == 0) {
	            System.out.println("The number " + number + " is divisible by both 2 and 4.");
	        } else {
	            System.out.println("The number " + number + " is not divisible by both 2 and 4.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}

