import java.util.PriorityQueue;

public class CreatePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");

        System.out.println("Priority queue elements: " + priorityQueue);
    }
}
