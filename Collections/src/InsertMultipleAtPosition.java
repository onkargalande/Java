import java.util.LinkedList;

public class InsertMultipleAtPosition {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add("Element 5");

        // Inserting "Element 2", "Element 3", and "Element 4" at position 1
        linkedList.add(1, "Element 2");
        linkedList.add(2, "Element 3");
        linkedList.add(3, "Element 4");

        System.out.println("Linked list after insertion: " + linkedList);
    }
}
