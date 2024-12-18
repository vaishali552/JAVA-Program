package JavaPackage;

public class cellByValue {
	int data=50; //local variable
	//call by method
	void print(int data)
	{
		data=data+100;//change in the local variable only
	}
	public static void main(String[] args) {
		cellByValue cbv=new cellByValue();
		cbv.print(500);
		System.out.println("before change"+cbv.data);
		cbv.print(500); //calling the method "print"
		System.out.println("After change"+cbv.data);
		
	}

}
