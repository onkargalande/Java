import java.util.LinkedList;
import java.util.ListIterator;

public class IterateReverseOrder {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        ListIterator<String> iterator = linkedList.listIterator(linkedList.size());

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
