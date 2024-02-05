class Rectangle {
    int length;
    int width;

    // Parameterized constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Constructor overloading
    public Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    void displayArea() {
        System.out.println("Area: " + (length * width));
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 10);
        rectangle1.displayArea();

        Rectangle rectangle2 = new Rectangle(7);
        rectangle2.displayArea();
    }
}
