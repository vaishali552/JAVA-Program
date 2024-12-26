package JavaPackage;

// Base class
class Employee {
    // Method to simulate work
    public void work() {
        System.out.println("Employee is working...");
    }

    // Method to get salary
    public double getSalary() {
        return 50000.0; // Default salary
    }
}

// Subclass
class HRManager extends Employee {
    // Overriding the work method
    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources...");
    }

    // New method specific to HRManager
    public void addEmployee(String employeeName) {
        System.out.println("HR Manager has added a new employee: " + employeeName);
    }
}

// Main class
public class Office {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee();
        employee.work(); // Output: Employee is working...
        System.out.println("Employee Salary: $" + employee.getSalary());

        // Create an instance of HRManager
        HRManager hrManager = new HRManager();
        hrManager.work(); // Output: HR Manager is managing human resources...
        System.out.println("HR Manager Salary: $" + hrManager.getSalary());
        hrManager.addEmployee("John Doe"); // Output: HR Manager has added a new employee: John Doe
    }
}
