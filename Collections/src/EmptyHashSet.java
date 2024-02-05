import java.util.HashSet;

public class EmptyHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element 1");
        hashSet.add("Element 2");
        hashSet.add("Element 3");

        // Emptying the hash set
        hashSet.clear();

        System.out.println("Hash set after clearing: " + hashSet);
    }
}
