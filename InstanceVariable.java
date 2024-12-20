package JavaPackage;

public class InstanceVariable {

	int a = 10;
    int square() {
    return a*a;
    }
     public static void main(String[] args) {
      InstanceVariable obj = new InstanceVariable();
	System.out.println(obj.square());
}
}