import java.util.HashMap;

public class RemoveAllMappings {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Key1", 10);
        hashMap.put("Key2", 20);
        hashMap.put("Key3", 30);

        // Removing all mappings from the HashMap
        hashMap.clear();

        System.out.println("HashMap after removing all mappings: " + hashMap);
    }
}
