import java.util.PriorityQueue;  // import heap class

public class KthLargest {

    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15}; // Input array
        int k = 3; // We want 3rd largest element

        // Create Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            pq.add(arr[i]); // Add element to heap

            
            if (pq.size() > k) {
                pq.poll(); // Removes smallest element
            }
        }

        // Top of heap is kth largest element
        System.out.println("Kth Largest Element: " + pq.peek());
    }
}
