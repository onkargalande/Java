import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");

        // Sorting the ArrayList
        Collections.sort(fruits);

        System.out.println("Sorted fruits: " + fruits);
    }
}
