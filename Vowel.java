package JavaPackage;
import java.util.Scanner;
import java.util.Set;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Check for empty input
        if (input.isEmpty()) {
            System.out.println("Input is empty. Please enter a valid string.");
            return;
        }

        // Initialize counters
        int vowelCount = 0, consonantCount = 0, otherCount = 0;

        // Convert to lowercase
        input = input.toLowerCase();

        // Define vowel set
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        // Loop through each character in the string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.contains(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (!Character.isWhitespace(ch)) {
                otherCount++;
            }
        }

        // Output results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of other characters: " + otherCount);
    }
}
