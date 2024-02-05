import java.util.HashSet;

public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element 1");
        hashSet.add("Element 2");
        hashSet.add("Element 3");

        // Iterating through elements
        for (String element : hashSet) {
            System.out.println(element);
        }
    }
}
