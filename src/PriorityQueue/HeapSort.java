package PriorityQueue;

public class  HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;

        // Step 1: Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move the current root (largest element) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify a subtree rooted at node i
    void heapify(int arr[], int n, int i) {
        int largest = i;  // Assume the root is the largest
        int left = 2 * i + 1;  // Left child index
        int right = 2 * i + 2; // Right child index

        // Check if the left child is larger than the root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if the right child is larger than the current largest
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If the largest is not the root, swap and heapify
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Driver program to test the above methods
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        HeapSort hs = new HeapSort();
        hs.sort(arr);

        System.out.println("Sorted array is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
