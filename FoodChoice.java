package JavaPackage;

import java.util.Scanner;

public class FoodChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your food type:");
        System.out.println("1. Vegetarian");
        System.out.println("2. Non-Vegetarian");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose Vegetarian. Here are the rice varieties:");
                System.out.println(" Vegetable Biryani");
                System.out.println(" Lemon Rice");
                System.out.println(" Tomato Rice");
                System.out.println(" Curd Rice");
                System.out.println(" Coconut Rice");
                System.out.println(" Peas Pulao");
                System.out.println(" Mushroom Fried Rice");
                break;

            case 2:
                System.out.println("You chose Non-Vegetarian. Here are the rice varieties:");
                System.out.println(" Chicken Biryani");
                System.out.println(" Mutton Biryani");
                System.out.println(" Egg Fried Rice");
                System.out.println(" Prawn Fried Rice");
                System.out.println(" Fish Biryani");
                System.out.println(" Crab Fried Rice");
                System.out.println(" Beef Biryani");
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 for Vegetarian or 2 for Non-Vegetarian.");
        }

        scanner.close();
    }
}
