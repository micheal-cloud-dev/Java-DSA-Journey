class MaxHeap {
    int[] heap;
    int size;
    int capacity;

    // Constructor
    MaxHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Parent index
    int parent(int i) {
        return (i - 1) / 2;
    }

    // Left child
    int left(int i) {
        return 2 * i + 1;
    }

    // Right child
    int right(int i) {
        return 2 * i + 2;
    }

    //  Insert (Heapify Up)
    void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        // Step 1: Insert at end
        heap[size] = value;
        int current = size;
        size++;

        // Step 2: Heapify Up (reverse of Min Heap)
        while (current > 0 && heap[current] > heap[parent(current)]) {
            int temp = heap[current];
            heap[current] = heap[parent(current)];
            heap[parent(current)] = temp;

            current = parent(current);
        }
    }

    // Delete root (max element)
    int delete() {
        if (size <= 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        if (size == 1) {
            size--;
            return heap[0];
        }

        // Store root
        int root = heap[0];

        // Replace root with last element
        heap[0] = heap[size - 1];
        size--;

        // Heapify Down
        heapifyDown(0);

        return root;
    }

    // Heapify Down
    void heapifyDown(int i) {
        int largest = i;
        int left = left(i);
        int right = right(i);

        // Check left child
        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        // Check right child
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;

            heapifyDown(largest);
        }
    }

    //  Peek (maximum)
    int peek() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        return heap[0];
    }

    //  Display
    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(10);

        h.insert(10);
        h.insert(20);
        h.insert(5);
        h.insert(30);

        h.display();   

        System.out.println("Max: " + h.peek()); 

        h.delete();
        h.display();   
    }
}
