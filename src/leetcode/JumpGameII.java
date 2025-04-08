package leetcode;

public class JumpGameII {
    public static void main(String[] args) {
//        Input: nums = [2,3,1,1,4]
//        Output: 2
        int nums[]={2,0};
        int ans=0;
        int last=nums[nums.length-1];
        int p1=0;
        int p2=1;
        while (p2!= nums.length){

            if (nums[p1]>last){
                ans=nums[p1]-last;
                break;
            }
            if (nums[p1]<nums[p2] && nums[p1]<last && nums[p2]<=last){
                ans=ans+nums[p2]-nums[p1];
                p1=p2;
                p2++;
            }
            else p2++;

        }
        System.out.println(ans);
    }
}
