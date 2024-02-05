import java.util.LinkedList;
import java.util.ListIterator;

public class IterateStartingAtPosition {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        int startPosition = 1;
        ListIterator<String> iterator = linkedList.listIterator(startPosition);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
