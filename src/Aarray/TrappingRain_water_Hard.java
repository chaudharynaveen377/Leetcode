package Aarray;

import java.util.Collection;
import java.util.Collections;

public class TrappingRain_water_Hard {
    public static int val_bw(int arr[],int idx1,int idx2){
        int sum=0;
        for (int i=idx1+1;i<idx2;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static int min_height(int []arr,int idx) {
        if (idx < 1 || idx >= arr.length-1) {
            return 0;
        }

        int max1 = 0;
        int max2 = 0;
        int p1 = 0, p2 = arr.length-1;
        while (p1 < idx || p2 > idx) {
            if (arr[p1] > arr[idx] && p1<idx) {
                max1 = Math.max(max1, arr[p1]);
            }
            p1++;

            if (arr[p2] > arr[idx] && p2>idx) {
                max2 = Math.max(max2, arr[p2]);
            }
            p2--;
        }
            return Math.min(max2, max1);

    }

    public static void main(String[] args) {
//        int arr[]={4,2,3};
//        int min=0;int max=1;
//        int ans=0;
//        while (min!=arr.length &&max!=arr.length){
//            if (arr[max]>=arr[min]){
//                ans=ans+arr[min]*(max-min-1)-val_bw(arr,min,max);
//                min=max;
//                max=max+1;
//            }
//            max++;
//            if (max>=arr.length && min <arr.length){
//                min=min+1;
//                max=min+1;
//            }
//
//        }
//        reverseArray(arr);
//        System.out.println(ans);
//        int ans1=0;
//         min=0; max=1;
//        while (min!=arr.length &&max!=arr.length){
//            if (arr[max]>=arr[min]){
//                ans1=ans1+arr[min]*(max-min-1)-val_bw(arr,min,max);
//                min=max;
//                max=max+1;
//            }
//            max++;
//            if (max>=arr.length && min <arr.length){
//                min=min+1;
//                max=min+1;
//            }
//
//        }
//        System.out.println(ans1);
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
int max_height=min_height(arr,1);
        int ans=0;
       for (int i=1;i<arr.length-1;i++){
            ans=(max_height!=0)?ans+max_height-arr[i] : ans+0;
            if (arr[i]>max_height){
                max_height=arr[i];
            }
        }
        System.out.println(ans);
    }
}
