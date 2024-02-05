class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample2 {
    public static void main(String[] args) {
        Person myPerson = new Person("Alice", 25);
        System.out.println("Name: " + myPerson.getName());
        System.out.println("Age: " + myPerson.getAge());
    }
}
