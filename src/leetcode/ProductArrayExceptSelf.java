package leetcode;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int nums[]={-1,1,0,-3,3};

//        Output: [24,12,8,6]  in O(n)
        int sum=1;
        int zeroes=0;
        for(int val:nums){
            if (val!=0){
            sum=sum*val;}
            else {
                zeroes++;
            }
        }
        for (int i=0;i<nums.length;i++){
            if (zeroes==0){
            nums[i]=sum/nums[i];}
            if (zeroes==1&&nums[i]==0){
                nums[i]=sum;
            }
            else if(zeroes==1&&nums[i]!=0){
                nums[i]=0;
            }
            if (zeroes>1){
                nums[i]=0;
            }
        }
        for (int val :nums){
            System.out.println(val);
        }
    }
}
