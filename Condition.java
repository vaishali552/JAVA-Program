package JavaPackage;

public class Condition {
	public static void main(String []args) {
		int a=100,b=90,c=80;
		//if-else-if ladder
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
}
