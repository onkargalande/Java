import java.util.PriorityQueue;

public class RemoveAllElements {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");

        // Removing all elements from the priority queue
        priorityQueue.clear();

        System.out.println("Priority queue after removal: " + priorityQueue);
    }
}
