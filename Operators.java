package JavaPackage;

public class Operators {
	//% operator (Reminder)
	public static void main(String a[]) {
		int a1=15,b=4,result;
		result=a1%b;
		System.out.println("% value is"+result);
		
		//-/-Division
		int result1=a1/b;
		System.out.println("% value is"+result1);
		
		//-*-multiplication
		int result2=a1/b;
		System.out.println("% value is"+result2);
		
		//-Unary operator(++)
		//Post Increment
		System.out.println("% value is"+(a1++));
		//Pre Increment
		System.out.println("% value is"+(++a1));
		
		//PostDecrement
		System.out.println("% value is"+(b--));
		
		//PreDecrement
		System.out.println("% value is"+(--b));
		
		//Assignment operator with Arithmetic Operator
		System.out.println(a1+=3);//a1=a1+3
		System.out.println(a1*=3);//a1=a1*3
		
		//Comparison operators
		int e=20,f=30,g=40;
		//>-greater than
		System.out.println((f>e));
		//>-lesser than
		System.out.println((f>e));
		//==equal to
		System.out.println((f==e));
		//>=-greater than equal to
		System.out.println((f>=e));
		//>=-lesser than equal to
		System.out.println((f<=e));
		
		//Logical Operator
		//&&-and,\\-or,!-not
		boolean x=true;
		boolean y=false;
		
		System.out.println((x && y));

		System.out.println((x || y));
		
		System.out.println((!x));
		
		
		//Ternary operator
		//condition?if true:if false
		//max of three numbers
		int e1=20,f1=10,g1=30,result6;
		
		//using tenary operator
		result6=((e1>f1)?(e1>g1)?e1:g1:(f1>g1)?f1:g1);
		System.out.println("max of 3 numbers"+result6);
		//
		
		
		
		int d=0b1010;
		int e7=0b1100;
		System.out.println("d&e7:"+(d&e7));
		System.out.println("d|e7:"+(d|e7));
		System.out.println("d^e7:"+(d^e7));
		System.out.println("d~e7:"+(~d));
		
		//instanceof() operator
		
		Operators op1=new Operators();
		Operators op2=new Operators();
		System.out.println((op1 instanceof Operators));
		System.out.println((op2 instanceof Operators));
		
	
		
	}

}
