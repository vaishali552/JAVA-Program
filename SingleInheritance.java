package JavaPackage;

class Car { // Class starts
    protected String brand = "TATA";

    public void horn() { // Method
        System.out.println("The car is honking on the road");
    }
} // Class ends

class SingleInheritance extends Car { // Implementing single inheritance
    public String model = "Indica"; // Property

    public static void main(String[] args) {
        // Create an object for SingleInheritance
        SingleInheritance myCar = new SingleInheritance();
        // Call the horn() method and access properties
        myCar.horn();
        System.out.println(myCar.brand + " and " + myCar.model);
    }
}
