import java.util.TreeSet;

public class AddAllToAnotherTreeSet {
    public static void main(String[] args) {
        TreeSet<String> originalSet = new TreeSet<>();
        originalSet.add("Red");
        originalSet.add("Green");
        originalSet.add("Blue");

        TreeSet<String> destinationSet = new TreeSet<>();
        destinationSet.add("Yellow");
        destinationSet.add("Orange");

        // Adding all elements of originalSet to destinationSet
        destinationSet.addAll(originalSet);

        System.out.println("Destination set after addition: " + destinationSet);
    }
}
