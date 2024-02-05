abstract class Shapes {
    abstract void draw();
}

class Circles extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class AbstractInheritanceExample {
    public static void main(String[] args) {
        Circles myCircles = new Circles();
        myCircles.draw();  // Implementing abstract method
    }
}
