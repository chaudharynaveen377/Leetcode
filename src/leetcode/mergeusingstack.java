package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class mergeusingstack {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,4};
        int[] brr ={0,0};
        int j=0,k=0,l=0;
        int[] ans =new int[arr.length+brr.length];
//
//        Queue <Integer> sc=new LinkedList <> () ;
//        for (int i=0;i<arr.length+brr.length;i++){
////            if (j == arr.length) {
////                j++;
////            }
//            if (i%2==0 && j<arr.length) {
//                sc.add(arr[j]);
//                j++;
//            }
//
//            if (i%2!=0 && k< brr.length){
//                sc.add(brr[k]);
//                k++;
//            }
//         if (k==brr.length){
//             sc.add(arr[j]);
//             j++;
//         }
//         if (j==arr.length){
//             sc.add(brr[k]);
//             k++;
//         }
//        }
//
//        System.out.println(sc);

        while (l<ans.length){
            if(arr[j]<brr[k]){
                ans[l]=arr[j];
                l++;
                j++;
            }
            else {
                ans[l]=brr[k];
                k++;
                l++;
            }
        }

    }
}
