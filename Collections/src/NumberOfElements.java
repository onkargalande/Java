import java.util.HashSet;

public class NumberOfElements {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element 1");
        hashSet.add("Element 2");
        hashSet.add("Element 3");

        int numberOfElements = hashSet.size();
        System.out.println("Number of elements: " + numberOfElements);
    }
}
