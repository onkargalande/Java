import java.util.ArrayList;

public class InsertAtFirstPosition {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Banana");

        // Inserting "Apple" at the first position
        fruits.add(0, "Apple");

        System.out.println("Fruits after insertion: " + fruits);
    }
}
