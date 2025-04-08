package DP.Practice.practice;

import java.util.HashMap;
import java.util.Map;

public class Climb_Stairs_70 {
    private static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }


        return climbStairs(n-1) + climbStairs(n-2);
    }
    public static void main(String[] args) {
//        n==2 ans =2; 1,1 and 2
//        n==3 ans =3 1,1 ,1 amd 1,2 and 2,1

        System.out.println(climbStairs(4));
    }
}
