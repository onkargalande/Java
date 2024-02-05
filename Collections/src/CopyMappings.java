import java.util.HashMap;

public class CopyMappings {
    public static void main(String[] args) {
        // Creating the source HashMap
        HashMap<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("Key1", 10);
        sourceMap.put("Key2", 20);

        // Creating the destination HashMap
        HashMap<String, Integer> destinationMap = new HashMap<>();

        // Copying all mappings from sourceMap to destinationMap
        destinationMap.putAll(sourceMap);

        System.out.println("Destination HashMap after copying: " + destinationMap);
    }
}
