import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);

        // Creating a new ArrayList and copying elements
        ArrayList<Integer> copyList = new ArrayList<>(originalList);

        System.out.println("Original list: " + originalList);
        System.out.println("Copy list: " + copyList);
    }
}
