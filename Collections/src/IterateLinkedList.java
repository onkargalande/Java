import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Iterating through elements
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
