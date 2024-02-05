import java.util.HashSet;
import java.util.TreeSet;

public class ConvertToTreeSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element 3");
        hashSet.add("Element 1");
        hashSet.add("Element 2");

        // Converting hash set to a tree set
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("Tree set from hash set: " + treeSet);
    }
}
