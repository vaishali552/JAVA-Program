package JavaPackage;

public class Classobj {

	String name="Malar";//instance variable
    int id=5;//instance variable
    double salary=987654;
     int bonus=9000; //instance variable

	public static void main(String[] args)
	{
	// TODO Auto-generated method stub

	Classobj obj=new Classobj();
    Classobj obj1=new Classobj();
    System.out.println(obj.id);
    System.out.println(obj.name);
    System.out.println(obj1.salary);
    System.out.println(obj1.bonus);
}
}