import java.util.HashMap;

public class CountMappings {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Key1", 10);
        hashMap.put("Key2", 20);
        hashMap.put("Key3", 30);

        // Counting the number of mappings
        int size = hashMap.size();

        System.out.println("Number of key-value mappings: " + size);
    }
}
