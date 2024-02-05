// Person class
class Person {
    private String firstName;
    private String lastName;

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Get first name method
    public String getFirstName() {
        return firstName;
    }

    // Get last name method
    public String getLastName() {
        return lastName;
    }
}

// Employee class (subclass of Person)
class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    // Constructor
    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    // Get employee ID method
    public int getEmployeeId() {
        return employeeId;
    }

    // Override getLastName() method to include job title
    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

// Main class
public class PersonEmployeeDemo {
    public static void main(String[] args) {
        // Create a Person
        Person person = new Person("John", "Doe");
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());

        System.out.println("-------------------------");

        // Create an Employee
        Employee employee = new Employee("Alice", "Smith", 1001, "Software Developer");
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
