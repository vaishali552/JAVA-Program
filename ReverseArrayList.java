package JavaPackage;

import java.util.ArrayList;

public class ReverseArrayList {
	public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        // 10 to 1 to the ArrayList
        for (int i = 10; i >= 1; i--)
        {
            numbers.add(i);
        }
        System.out.println("Numbers in reverse order:");
        for (int number : numbers) 
        {
            System.out.print(number + " ");
        }
    } 
}
