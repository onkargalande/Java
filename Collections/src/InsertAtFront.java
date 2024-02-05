import java.util.LinkedList;

public class InsertAtFront {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Inserting "Element 1" at the front
        linkedList.addFirst("Element 1");

        System.out.println("Linked list after insertion: " + linkedList);
    }
}
