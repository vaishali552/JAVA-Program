package JavaPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Fouryear {

    public static void main(String[] args) {
        // now() returns the current date and time
        LocalDate obj = LocalDate.now();
        LocalTime obj1 = LocalTime.now();
        System.out.println("Current Date: " + obj);
        System.out.println("Current Time: " + obj1);

        // Taking input for the date
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in the format (dd/MM/yyyy):");
        String userDate = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Parsing the user input date
            Date date = dateFormat.parse(userDate);
            
            // Adding 4 years to the date
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.YEAR, 4);
            
            // Displaying the updated date
            Date updatedDate = calendar.getTime();
            System.out.println("After 4 years, the date will be: " + dateFormat.format(updatedDate));
        } catch (ParseException e) {
            System.out.println("Invalid input. Please enter the date in the correct format (dd/MM/yyyy).");
        }
        
        // Closing the scanner
        sc.close();
    }
}
