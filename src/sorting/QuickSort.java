package sorting;

public class QuickSort {
static void swap(int arr[],int x,int y){
    int temp=arr[x];
    arr[x]=arr[y];
    arr[y]=temp;
}
    // Method to perform the quicksort
    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
    }
    public static int partition(int[] arr, int low, int high) {
       int pivot=arr[high];
       int cnt =0;
       for (int i=low;i<high;i++){
           if (arr[i]<=pivot)cnt++;
       }
       int pivot_idx=low+cnt;
       swap(arr,high,pivot_idx);

       int i=low,j=high;
       while (i<pivot_idx && j>pivot_idx){
           while (arr[i]<=pivot)i++;
           while (arr[j]>pivot)j--;
           if (i<pivot_idx && j>pivot_idx){
               swap(arr,i,j);
           }
        }
return pivot_idx;
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9,-3,5,2,6,8,-6,1,3};
        System.out.println("Unsorted array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

