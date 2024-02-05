import java.util.HashMap;

public class AddToHashMap {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Associating value 10 with key "Key1"
        hashMap.put("Key1", 10);

        System.out.println("HashMap after adding a mapping: " + hashMap);
    }
}
