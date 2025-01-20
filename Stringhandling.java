package JavaPackage;

public class Stringhandling {
	 public static void main(String[] args) {
		 int a=10;
		 String s=String.valueOf(a);
		 System.out.println(s+10);
		 
		 StringBuffer sb=new StringBuffer("Hai");
		 //append()
		 sb.append("Java");
		 System.out.println(sb);
		 //insert
		 sb.insert(1,"Advanced Java");
		 System.out.println(sb);
		 
		 //delete()
		 sb.delete(1, 8);
		 System.out.println(sb);
		 
		 //reverse
		 sb.reverse();
		 System.out.println(sb);
		 StringBuffer sbr=new StringBuffer("SLA");
		 //conversion from String
		 String str=sbr.toString();
		 StringBuilder sb1=new StringBuilder(str);
		 System.out.println(sb1);
	 }
}




//contant of the buffer their without creating the new obejcty
//charcter string band position and inside charter of the postiuon of the buffer 
//delete to char romer of the buffer and Rename order of char in the buffer
//apan is use to chanter of the  buffer and S String   --string buffer are safe becuse by using mutiple threds and 
//senkinece to multiple of object and it is faster and it safe   
//sting buffer is not buffer and it useful sting bulder  is noting but it can't be a sting then are convet dirtly after conveting dirtely 