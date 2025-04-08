package DP.Practice.practice;

import java.util.Arrays;

public class practice {
    static int fab(int n,int []dp){
        if (n==0 || n==1 ){
            return n;
        }
        if (dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fab(n-1,dp)+fab(n-2,dp);

    }
    public static void main(String[] args) {
//         find fabinacci of n
//        0 1 1 2 3 5 8
        int[] array = new int[6+1];
        Arrays.fill(array, -1);
        int fb=fab(6,array);
        System.out.println(fb);
    }
}
