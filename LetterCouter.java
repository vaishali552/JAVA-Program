package JavaPackage;
import java.util.Scanner;

public class LetterCouter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Check for empty input
        if (sentence.isEmpty()) {
            System.out.println("Input is empty. Please enter a valid sentence.");
            return;
        }

        // Initialize counts
        int letterCount = 0, digitCount = 0, spaceCount = 0, specialCharCount = 0;

        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                specialCharCount++;
            }
        }

        // Output the counts
        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of spaces: " + spaceCount);
        System.out.println("Number of special characters: " + specialCharCount);
    }
}
