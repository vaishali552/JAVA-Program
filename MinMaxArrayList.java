package JavaPackage;

import java.util.ArrayList;
import java.util.Collections;

public class MinMaxArrayList {
	 public static void main(String[] args) {
	        // Create an ArrayList and add elements
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(5);
	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(20);
	        numbers.add(25);

	        // Find the minimum and maximum elements using Collections
	        int min = Collections.min(numbers);
	        int max = Collections.max(numbers);

	        // Print the ArrayList, minimum, and maximum values
	        System.out.println("ArrayList: " + numbers);
	        System.out.println("Minimum element: " + min);
	        System.out.println("Maximum element: " + max);
	    }
	}

