package JavaPackage;

public class SwitchSting {
	
	public static void main(String []args) {
		//Switch(expression)
		//case a:
		//code
		//break
		int day=3;
		//used String in expression
		switch(day)
		{
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 4:System.out.println("Wednesday");
		break;
		case 5:System.out.println("Thrusday");
		break;
		case 6:System.out.println("Friday");
		break;
		case 7:System.out.println("Saturday");
		break;
		default://no need to implement break
			System.out.println("Looking forward for the correct number");
		}
		System.out.println("Your day is" +day);
	}

}
