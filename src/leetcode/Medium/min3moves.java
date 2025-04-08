package leetcode.Medium;

import java.util.Arrays;

public class min3moves {
    public static void main(String[] args) {
//        to find the min difference after three moves
        int nums[]={20,75,81,82,95};
        Arrays.sort(nums);
        int nums1[]=new int[nums.length];
        for (int i=0;i< nums.length;i++){
            nums1[i]=nums[i];
        }
       int p1=0;
       int p2=1;
       int p3=2;
       if (nums.length<=4){
           System.out.println("ans "+0);
           return;
       }
       int ans=Integer.MAX_VALUE;
       for(int i=0;i< nums.length;i++){
       while (p3< nums.length){
           nums[p1]=nums[i];
           nums[p2]=nums[i];
           nums[p3]=nums[i];
           Arrays.sort(nums);
           int min1=nums[0];
           int max2=nums[nums.length-1];
           int dummy=max2-min1;
           if (dummy<=ans){
               ans=dummy;
               dummy=0;
           }

           for (int j=0;j< nums.length;j++){
               nums[j]=nums1[j];
           }
           p1++;
           p2++;
           p3++;
       }
            p1=0;
            p2=1;
           p3=2;
       }
        System.out.println("ans=="+ans);
    }
}
