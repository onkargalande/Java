import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("Element 1");
        elements.add("Element 2");
        elements.add("Element 3");

        for (String element : elements) {
            System.out.println(element);
        }
    }
}
