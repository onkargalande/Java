import java.util.HashSet;

public class TestEmptyHashSet {
    public static void main(String[] args) {
        HashSet<String> emptySet = new HashSet<>();
        HashSet<String> nonEmptySet = new HashSet<>();
        nonEmptySet.add("Element 1");

        System.out.println("Is emptySet empty? " + emptySet.isEmpty());
        System.out.println("Is nonEmptySet empty? " + nonEmptySet.isEmpty());
    }
}
