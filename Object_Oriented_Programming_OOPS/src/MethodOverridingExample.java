class Animals {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogss extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Dogss myDog = new Dogss();
        myDog.makeSound();  // Overridden method in subclass
    }
}
