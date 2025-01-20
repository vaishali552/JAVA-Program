package JavaPackage;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Check for empty input
        if (sentence.trim().isEmpty()) {
            System.out.println("No words found. Please enter a valid sentence.");
            return;
        }

        // Trim and split the sentence by spaces to count words
        String[] words = sentence.trim().split("\\s+");

        // Count the words
        int wordCount = words.length;

        // Output the word count and the words themselves
        System.out.println("Number of words in the given sentence: " + wordCount);
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
