package Aarray;

import java.util.Arrays;
import java.util.Collections;

public class RangeSum {
    public static int[] subsets(int[] arr,int n) {
        int range[]=new int[n*(n+1)/2];
        int i=0,j=0,len=arr.length;
//        while (){
//
//        }
        Arrays.sort(range);
        return range;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
//        make a function to return an array of all the subsets of an array of arr
      int []range=  subsets(arr,4);
      int left=1;
      int right=5;
      int ans=0;
     for (int i=left;i<=right;i++){
         ans=ans+range[i-1];
     }
        System.out.println(ans);
    }

}
