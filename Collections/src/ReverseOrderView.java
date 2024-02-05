import java.util.TreeSet;

public class ReverseOrderView {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");

        // Creating a reverse order view
        TreeSet<String> reverseOrderView = (TreeSet<String>) treeSet.descendingSet();

        System.out.println("Tree set in reverse order: " + reverseOrderView);
    }
}
