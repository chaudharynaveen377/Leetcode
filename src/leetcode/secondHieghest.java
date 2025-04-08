package leetcode;

import Aarray.ReverseArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class secondHieghest {
    static void swap(int a,int b,int []arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int arr[]={34,1243,2134,1342,34,334};
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-2]);
        int j=0;
       for (int i=0;i<arr.length-1;i++){

//           while(j+1!=i){
//               if (arr[i]>=arr[i+1]){
//                   swap(i,i+1,arr);
//                   j=j-1;
//               }
//
//           }
       }
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}
