package JavaPackage;
import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.println("Enter the first number (a):");
        int a = scanner.nextInt();
        System.out.println("Enter the second number (b):");
        int b = scanner.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swap values using addition and subtraction
        a = a + b; // a now holds the sum of a and b
        b = a - b; // b is assigned the original value of a
        a = a - b; // a is assigned the original value of b
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
