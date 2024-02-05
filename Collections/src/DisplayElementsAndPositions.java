import java.util.LinkedList;

public class DisplayElementsAndPositions {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Element at position " + i + ": " + linkedList.get(i));
        }
    }
}
