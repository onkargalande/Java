import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        int indexToUpdate = 1;
        String updatedName = "Charlie";

        names.set(indexToUpdate, updatedName);

        System.out.println("Names after update: " + names);
    }
}
