package JavaPackage;

// Base class
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Creating an instance of the base class
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound

        // Creating an instance of the subclass
        Cat cat = new Cat();
        cat.makeSound(); // Output: Cat meows
    }
}
