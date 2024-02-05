class Employee {
    private String name;
    private double salary;

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Alice");
        employee.setSalary(50000);

        System.out.println("Employee: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }
}
