import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add("Element 2");

        // Inserting "Element 3" at the end
        linkedList.addLast("Element 3");

        System.out.println("Linked list after insertion: " + linkedList);
    }
}
