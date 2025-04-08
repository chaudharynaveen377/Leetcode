package Daily_Leetcodde.java.Medium;

import java.util.Arrays;

public class LaxicographicallySmallestArray_2948 {
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int arr[]={25,58,36,16,42,57,17,96,10,2};
        int limit=13;
//        our approach should be find min from rest of the element accordngf to given condition
        for (int i=0;i<arr.length;i++){
            int swap_idx=i;
            int temp=arr[i];
            for (int j=i+1 ;j<arr.length;j++){
              if (temp>arr[j] && Math.abs(arr[j]-temp)<=limit){
                  temp=arr[j];
                  swap_idx=j;

                  while (i<j){
                      if(temp>arr[j] && Math.abs(arr[j]-temp)<=limit){
                          temp=arr[j];
                          swap_idx=j;
                      }
                      j--;
                  }
                 }
            }
            if (swap_idx != i) {
                swap(arr, i, swap_idx);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
