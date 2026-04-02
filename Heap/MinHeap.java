class MinHeap {
    int[] heap;
    int size;
    int capacity;

    // Constructor
    MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Get parent index
    int parent(int i) {
        return (i - 1) / 2;
    }

    //  Get left child index
    int left(int i) {
        return 2 * i + 1;
    }

    //  Get right child index
    int right(int i) {
        return 2 * i + 2;
    }

    // Insert (Heapify Up)
    void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        // Step 1: Insert at end
        heap[size] = value;
        int current = size;
        size++;

        // Step 2: Heapify Up
        while (current > 0 && heap[current] < heap[parent(current)]) {
            // Swap
            int temp = heap[current];
            heap[current] = heap[parent(current)];
            heap[parent(current)] = temp;

            // Move up
            current = parent(current);
        }
    }

    //  Delete root (Heapify Down)
    int delete() {
        if (size <= 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        if (size == 1) {
            size--;
            return heap[0];
        }

        // Step 1: Store root
        int root = heap[0];

        // Step 2: Replace root with last element
        heap[0] = heap[size - 1];
        size--;

        // Step 3: Heapify Down
        heapifyDown(0);

        return root;
    }

    // Heapify Down
    void heapifyDown(int i) {
        int smallest = i;
        int left = left(i);
        int right = right(i);

        // Check left child
        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        // Check right child
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        // If smallest is not root
        if (smallest != i) {
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;

            // Recursively heapify
            heapifyDown(smallest);
        }
    }

    // Peek (get minimum)
    int peek() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        return heap[0];
    }

    // Display heap
    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        MinHeap h = new MinHeap(10);

        h.insert(10);
        h.insert(20);
        h.insert(5);
        h.insert(30);

        h.display();  

        System.out.println("Min: " + h.peek()); 

        h.delete();
        h.display();   
    }
}
