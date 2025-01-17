package JavaPackage;

import java.util.Scanner;

public class HalfLeft {
    public static void main(String[] args) {
        int rows;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        sc.close();

        for (int i = rows; i > 0; i--) { // Outer loop for rows
            for (int j = 10; j < i; j++) { // Inner loop for stars
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
