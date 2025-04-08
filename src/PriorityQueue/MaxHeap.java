package PriorityQueue;

import java.util.Arrays;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    public MaxHeap(int capacity) {
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
        while (index > 0 && heap[parent(index)] < heap[index]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    // Remove and return the maximum value (root)
    public int extractMax() {
        if (size <= 0) return Integer.MIN_VALUE;
        if (size == 1) return heap[--size];

        int max = heap[0];
        heap[0] = heap[--size];
        heapifyDown(0);

        return max;
    }

    // Restore the heap property from a parent to its children
    private void heapifyDown(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left] > heap[largest]) largest = left;
        if (right < size && heap[right] > heap[largest]) largest = right;

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
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
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(30);
        maxHeap.insert(40);

        System.out.println("Max Heap:");
        maxHeap.printHeap();

        System.out.println("Extracted Max: " + maxHeap.extractMax());
        maxHeap.printHeap();
    }
}
