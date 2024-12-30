package JavaPackage;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {
    	 // Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Input the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = scanner.nextInt();

        // Determine the greatest number
        int greatest;
        if (num1 > num2 && num1 > num3) {
            greatest = num1;
        } else if (num2 > num1 && num2 > num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }
        System.out.println("The greatest number is: " + greatest);
        scanner.close();
    }
}
