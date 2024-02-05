interface Sound {
    void makeSound();
}

class Dogs implements Sound {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceInheritanceExample {
    public static void main(String[] args) {
        Dogs myDog = new Dogs();
        myDog.makeSound();  // Implementing interface method
    }
}
