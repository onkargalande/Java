public class Student {
    String name;
    int age;
    String course;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 20;
        student1.course = "Computer Science";
        student1.displayInfo();
    }
}
