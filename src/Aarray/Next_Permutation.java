package Aarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Next_Permutation {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    static void nextPermutation(int[]arr){
        int n=arr.length;
        if (n<=1)return;
        int i=n-2;
        while (i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if (i>=0){
            int j=n-1;
            while (arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,n-1);
    }
    static void swap(int []arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void reverse(int[]arr,int start,int end){
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,1,3};

        ArrayList<ArrayList<Integer>>anslt=new ArrayList<>();
        int x=factorial(arr.length);
     while (x!=0){
         ArrayList<Integer>lt=new ArrayList<>();
         for (int i=0;i<arr.length;i++){
             lt.add(arr[i]);
         }
         if (!anslt.contains(lt)) {
             anslt.add(lt);
         }
         nextPermutation(arr);
         x=x-1;
     }
        System.out.println(anslt);
        List<Integer>lr=new ArrayList<>();
    }
}
