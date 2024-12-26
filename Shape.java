package JavaPackage;

class Shape {
    public void display() {
        System.out.println("Inside display");
    }
}

class Rectangle extends Shape { // Corrected to extend "Shape"
    public void area() {
        System.out.println("Inside area");
    }
}

class Cube extends Rectangle { // Corrected class name to "Cube"
    public void volume() {
        System.out.println("Inside volume");
    }
}

 class Tester {
    public static void main(String[] args) {
        // Create an object of Cube-
        Cube myObj = new Cube(); // Corrected class name to "Cube"
        myObj.display();
        myObj.area();
        myObj.volume();
    }
}
