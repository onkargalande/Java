// Employee class
class Employee {
    private double salary;

    // Constructor
    public Employee(double salary) {
        this.salary = salary;
    }

    // Work method
    public void work() {
        System.out.println("Employee is working");
    }

    // Get salary method
    public double getSalary() {
        return salary;
    }
}

// HRManager class (subclass of Employee)
class HRManager extends Employee {
    // Constructor
    public HRManager(double salary) {
        super(salary);
    }

    // Overridden work method
    @Override
    public void work() {
        System.out.println("HR Manager is managing HR tasks");
    }

    // New method specific to HRManager
    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create an Employee
        Employee employee = new Employee(50000);
        System.out.println("Employee Salary: $" + employee.getSalary());
        employee.work();

        System.out.println("-------------------------");

        // Create an HRManager
        HRManager hrManager = new HRManager(60000);
        System.out.println("HR Manager Salary: $" + hrManager.getSalary());
        hrManager.work();   // Calls overridden work method
        hrManager.addEmployee();  // Calls the new method in HRManager
    }
}
