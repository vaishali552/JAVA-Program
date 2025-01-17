package JavaPackage;

public class HeartPattern {
    public static void main(String[] args) {
        int n = 6; // Size of the heart pattern

        // Upper part of the heart
        for (int i = n / 2; i <= n; i += 2) {
            // Print leading spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }

            // Print first half of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces between two halves of the heart
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print second half of the heart
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }

        // Lower part of the heart
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print the bottom part of the heart
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }
}
