import java.util.*;

public class RemoveLeastKeyMapping {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put(5, "Value 5");
        treeMap.put(2, "Value 2");
        treeMap.put(8, "Value 8");
        treeMap.put(1, "Value 1");
        treeMap.put(4, "Value 4");

        System.out.println("Original TreeMap: " + treeMap);

        // Removing and getting the least key-value mapping
        Map.Entry<Integer, String> leastEntry = removeLeastKeyMapping(treeMap);

        if (leastEntry != null) {
            System.out.println("Removed Least Key Mapping: Key = " + leastEntry.getKey() +
                    ", Value = " + leastEntry.getValue());
            System.out.println("Updated TreeMap: " + treeMap);
        } else {
            System.out.println("The TreeMap is empty. No key-value mapping to remove.");
        }
    }

    // Method to remove and get the key-value mapping associated with the least key
    private static Map.Entry<Integer, String> removeLeastKeyMapping(TreeMap<Integer, String> map) {
        // Using firstEntry() to get the least key-value mapping
        Map.Entry<Integer, String> leastEntry = map.pollFirstEntry();
        return leastEntry;
    }
}
