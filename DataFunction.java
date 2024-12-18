package JavaPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class DataFunction {

	public static void main(String[] args) {
		//now() return the date
		LocalDate obj=LocalDate.now();
		LocalTime obj1=LocalTime.now();
		System.out.println(obj);
		System.out.println(obj1);
		
		
		Scanner sobj=new Scanner(System.in);
		System.out.print("Enter the date in this format(dd//mm//yyyy)");
		//Read the input using next() method
		String dateStr=sobj.next();
	//Parse the input string into Date object using DateFormat
		SimpleDateFormat sdf=new SimpleDateFormat("dd//mm//yyyy");
		try {
			//1.Initalize Date
			//2.Parshing Scanner obj
			//3.input from the user with right format
			
			Date date=sdf.parse(dateStr);
			//format is used to formatting the date according to sdf
			System.out.println("Input Date"+sdf.format(date));
			}
		//ParseException is used to check the format |(DD/MM/YYYY)
		catch(ParseException e)
		{
			System.out.println("Invalid date format");
	}
		sobj.close();
	}
}
