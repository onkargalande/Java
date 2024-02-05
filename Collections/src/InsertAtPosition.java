import java.util.LinkedList;

public class InsertAtPosition {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add("Element 3");

        // Inserting "Element 2" at position 1
        linkedList.add(1, "Element 2");

        System.out.println("Linked list after insertion: " + linkedList);
    }
}
