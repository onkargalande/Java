import java.util.PriorityQueue;

public class InsertElement {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");

        // Inserting "Yellow" into the priority queue
        priorityQueue.offer("Yellow");

        System.out.println("Priority queue after insertion: " + priorityQueue);
    }
}
