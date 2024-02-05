import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element 1");
        hashSet.add("Element 2");

        // Appending "Element 3" to the hash set
        hashSet.add("Element 3");

        System.out.println("Hash set after appending: " + hashSet);
    }
}
