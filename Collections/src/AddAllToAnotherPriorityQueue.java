import java.util.PriorityQueue;

public class AddAllToAnotherPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> originalPriorityQueue = new PriorityQueue<>();
        originalPriorityQueue.add("Red");
        originalPriorityQueue.add("Green");
        originalPriorityQueue.add("Blue");

        PriorityQueue<String> destinationPriorityQueue = new PriorityQueue<>();
        destinationPriorityQueue.add("Yellow");
        destinationPriorityQueue.add("Orange");

        // Adding all elements of originalPriorityQueue to destinationPriorityQueue
        destinationPriorityQueue.addAll(originalPriorityQueue);

        System.out.println("Destination priority queue after addition: " + destinationPriorityQueue);
    }
}
