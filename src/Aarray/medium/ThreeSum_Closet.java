package Aarray.medium;

public class ThreeSum_Closet {
    public static void main(String[] args) {
       int[] nums = {0,0,0};int target = 1;
        int ans=Integer.MAX_VALUE;
        int ans1=Integer.MAX_VALUE;
        for (int i=0;i< nums.length-2;i++){
            for (int j=i+1;j<nums.length-1;j++){
                for (int k=j+1;k< nums.length;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    int min=Math.abs(target-(sum));
                    if (ans>min) {
                        ans = Math.min(ans, min);
                        ans1=sum;
                    }
                }
            }
        }
        System.out.println(ans1);
        
    }
}
