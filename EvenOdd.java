package JavaPackage;

public class EvenOdd {
	public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;

        // Loop through numbers from 0 to 25
        for (int i = 0; i <= 25; i++) {
            if (i % 2 == 0) {
                // Add to sumEven if the number is even
                sumEven += i;
            } else {
                // Add to sumOdd if the number is odd
                sumOdd += i;
            }
        }

        // Print the results
        System.out.println("Sum of even numbers between 0 and 25: " + sumEven);
        System.out.println("Sum of odd numbers between 0 and 25: " + sumOdd);
    }
}


