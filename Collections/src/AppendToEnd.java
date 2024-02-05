import java.util.LinkedList;

public class AppendToEnd {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add("Element 2");

        // Appending an element to the end
        linkedList.addLast("Appended Element");

        System.out.println("Linked list after appending: " + linkedList);
    }
}
