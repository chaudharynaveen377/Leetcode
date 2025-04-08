package DP.Practice.practice;

import java.util.Arrays;

public class house_robber_198 {
    static int []ar=new int[101];
    static int solve(int arr[],int i,int n){
        if (i>=n){
            return 0;
        }
        if (ar[i]!=-1){
            return ar[i];
        }
        int steal=arr[i]+solve(arr,i+2,n);
        int skip=solve(arr,i+1,n);
        return ar[i]=Math.max(steal,skip);
    }
    public static void main(String[] args) {
        int arr[]={2,7,9,3,1};
        Arrays.fill(ar,-1);
        System.out.println(solve(arr,0,arr.length));
    }
}
