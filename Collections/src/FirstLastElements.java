import java.util.TreeSet;

public class FirstLastElements {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");

        // Getting the first and last elements
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}
