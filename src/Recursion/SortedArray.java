package Recursion;
public class SortedArray {
    static boolean sorted(int []arr,int i){
if (i==arr.length-1){
    return true;
}
if (arr[i]>arr[i+1]){
    return false;
}
return sorted(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 5, 7, 8};
        System.out.println( sorted(arr,0));
    }
}