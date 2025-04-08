package Aarray.Easy;

import java.util.Arrays;

public class RotateArray {

    // Function to rotate an array to the right by k positions
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        reverse(arr, 0, n - 1);           // Reverse the entire array
        reverse(arr, 0, k - 1);           // Reverse the first k elements
        reverse(arr, k, n - 1);           // Reverse the remaining elements
    }

    // Utility function to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int k = 2;

        System.out.println("Original Array: " + Arrays.toString(array));
        rotateRight(array, k);
        System.out.println("Array after rotating to the right by " + k + ": " + Arrays.toString(array));
    }
}
