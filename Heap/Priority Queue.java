import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        
        // ================= MIN HEAP =================
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert elements into Min Heap
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(2);

        
        System.out.println("Min Heap Top (Smallest): " + minHeap.peek());

        
        System.out.println("Min Heap elements:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // removes smallest each time
        }


        // ================= MAX HEAP =================
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(2);

        
        System.out.println("\nMax Heap Top (Largest): " + maxHeap.peek());

        
        System.out.println("Max Heap elements:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll()); // removes largest each time
        }
    }
}
