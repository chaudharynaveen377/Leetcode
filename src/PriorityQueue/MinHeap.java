package PriorityQueue;

import java.util.Arrays;

public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // Get parent, left, and right indices
    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    // Insert a value into the heap
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }
        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    // Restore the heap property from a child to its parent
    private void heapifyUp(int index) {
        while (index > 0 && heap[parent(index)] > heap[index]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    // Remove and return the minimum value (root)
    public int extractMin() {
        if (size <= 0) return Integer.MAX_VALUE;
        if (size == 1) return heap[--size];

        int min = heap[0];
        heap[0] = heap[--size];
        heapifyDown(0);

        return min;
    }

    // Restore the heap property from a parent to its children
    private void heapifyDown(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left] < heap[smallest]) smallest = left;
        if (right < size && heap[right] < heap[smallest]) smallest = right;

        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    // Swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Display the heap
    public void printHeap() {
        System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(15);
        minHeap.insert(30);
        minHeap.insert(40);

        System.out.println("Min Heap:");
        minHeap.printHeap();

        System.out.println("Extracted Min: " + minHeap.extractMin());
        minHeap.printHeap();
    }
}
