import java.util.LinkedList;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Banana");

        String elementToFind = "Banana";
        int firstOccurrence = linkedList.indexOf(elementToFind);
        int lastOccurrence = linkedList.lastIndexOf(elementToFind);

        System.out.println("First occurrence of '" + elementToFind + "': " + firstOccurrence);
        System.out.println("Last occurrence of '" + elementToFind + "': " + lastOccurrence);
    }
}
