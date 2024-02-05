import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}

public class ObjectSerialization {
    public static void main(String[] args) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.ser"));

            Student student = new Student("John", 20);
            outputStream.writeObject(student);

            outputStream.close();

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.ser"));

            Student readStudent = (Student) inputStream.readObject();
            System.out.println("Read Student: " + readStudent);

            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
