import java.util.HashSet;

public class CloneHashSet {
    public static void main(String[] args) {
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("Element 1");
        originalSet.add("Element 2");
        originalSet.add("Element 3");

        // Cloning the hash set
        HashSet<String> clonedSet = new HashSet<>(originalSet);

        System.out.println("Original set: " + originalSet);
        System.out.println("Cloned set: " + clonedSet);
    }
}
