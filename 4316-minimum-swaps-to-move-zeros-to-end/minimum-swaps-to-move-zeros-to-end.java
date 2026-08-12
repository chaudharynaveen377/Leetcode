class Solution {
    public int minimumSwaps(int[] nums) {
        int count=0;
        int st=0;
        int lt=nums.length-1;
       
        while(st<lt){
            if(nums[st]==0 && nums[lt]!=0){
                int temp=nums[st];
                nums[st]=nums[lt];
                nums[lt]=temp;
                lt--;
                count++;
            }else if(nums[lt]==0){
                  lt--;
            }
            if(nums[st]!=0){
            st++;
            }
        }
        return count;
    }
}