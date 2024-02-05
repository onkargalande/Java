import java.util.Iterator;
import java.util.PriorityQueue;

public class IteratePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");

        // Iterating through elements using an iterator
        Iterator<String> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
