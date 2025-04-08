package Daily_Leetcodde.java.Medium;

import java.util.*;

public class longest_square_streak_2501 {
    public static  int longestSquareStreak(int[] nums) {
        Set<Long> set = new HashSet<>();
        for(int num : nums) set.add((long)(num));
        int max = -1;
        for(int num : nums) {
            int len = 1;
            while(set.contains(num*1l*num*1l)) {
                len++;
                num=num*num;
                max = Math.max(max, len);
            }
        }
        return max;
    }
    public static void main(String[] args) {
//
        int arr[]={2,4,8,26,32};
        System.out.println(longestSquareStreak(arr));
        System.out.println(16*1l);
    }
}
