package Recursion.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static List<int[]> lt=new ArrayList<>();
    public static void permutation(int[] arr, int i) {
        if (i == arr.length - 1) {
            lt.add(arr.clone());
            return;
        }
        for (int k = i; k < arr.length; k++) {
            swap(arr, i, k);
            permutation(arr, i + 1);
            swap(arr, i, k);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
permutation(arr,0);
        System.out.println(lt.stream().map(Arrays::toString).toList());

    }
}
