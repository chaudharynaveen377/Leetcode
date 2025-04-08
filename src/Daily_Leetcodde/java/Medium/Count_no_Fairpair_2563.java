package Daily_Leetcodde.java.Medium;

import java.util.Arrays;

public class Count_no_Fairpair_2563 {
    static int fair_pair(int []nums,int lower,int upper){
//        Arrays.sort(nums);
        int count=0;
//      sing sliding window
        int i=0,j=i+1;
        while (i<nums.length && j< nums.length){
            if ((nums[i]+nums[j])<=upper && (nums[i]+nums[j])>=lower){
                count++;
                j++;
            }
           else if ((nums[i]+nums[j])<lower){
                j++;
            }
            else {i++;
                j=i+1;
            }
            if (j>= nums.length){
                i++;
                j=i+1;
                continue;
            }

        }
    return count;
    }
    public static void main(String[] args) {
//        nums = [0,1,7,4,4,5], lower = 3, upper = 6
//        0 1 4 4  5 7
        int nums[]={1,7,9,2,5};
        System.out.println(fair_pair(nums,11,11));

    }
}
