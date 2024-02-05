import java.util.TreeSet;

public class IterateTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");

        // Iterating through elements
        for (String color : treeSet) {
            System.out.println(color);
        }
    }
}
