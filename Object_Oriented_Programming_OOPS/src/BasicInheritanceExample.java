class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }
}

public class BasicInheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Inherited method
        myCar.drive();  // Subclass method
    }
}
