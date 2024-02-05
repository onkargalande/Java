import java.util.HashSet;

public class ConvertToArrayList {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element 1");
        hashSet.add("Element 2");
        hashSet.add("Element 3");

        // Converting hash set to an array
        String[] array = hashSet.toArray(new String[0]);

        System.out.println("Array from hash set: " + java.util.Arrays.toString(array));
    }
}
