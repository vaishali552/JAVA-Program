package JavaPackage;

import java.util.Scanner;

public class FirstPattern {
	public static void main(String[] args) {
        int rows, i, j, space;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        sc.close();
        // Upper part of the diamond
        space = rows - 1;
        for (j = 1; j <= rows; j++) {
            // Print spaces
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;

            // Print stars
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
	
	space++;

    // Print stars
    for (i = 1; i <= 2 * (rows - j) - 1; i++)
    {
        System.out.print("*");
    }
    System.out.println("");
}
}

