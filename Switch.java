package JavaPackage;

public class Switch {
	public static void main(String []args) {
		 String day = "Wednesday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the work week.");
                break;
            case "Friday":
                System.out.println("End of the work week.");
                break;
            case "Wednesday":
                System.out.println("Midweek!");
                break;
            default:
                System.out.println("Not a valid day.");
		}
	}
}
