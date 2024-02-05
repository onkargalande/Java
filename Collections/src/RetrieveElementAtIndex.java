import java.util.ArrayList;

public class RetrieveElementAtIndex {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");

        int indexToRetrieve = 1;
        String retrievedElement = items.get(indexToRetrieve);

        System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);
    }
}
