package Sliding_Window.CodeStory;

import java.util.Arrays;

public class K_radius_subArray_2090 {

    public static void main(String[] args) {
       int arr[]={1,2,0,0,0,0,1};
       int ans[]=new int[arr.length];
        Arrays.fill(ans,-1);
       int k=3;
//       create a prifix sum array
        int prefixSum[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            if (i==0){
                prefixSum[0]=arr[0];
            }
            else prefixSum[i]=prefixSum[i-1]+arr[i];
        }
//     i start from k end at arr.length-k-1
        for (int i=k;i<arr.length-k;i++){

            int lftSum=(i-k-1<0)?0:prefixSum[i-k-1];

            ans[i]=(prefixSum[i+k]-lftSum)/(2*k+1);
        }
        for (int i:ans){
            System.out.print(" "+i);
        }
    }
}
