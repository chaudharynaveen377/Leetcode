package Daily_Leetcodde.java.Medium;

public class Max_Ramp_962 {
    static int max_ramp(int arr[]){
        int ans=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i;j<arr.length;j++){
                if (arr[i]<=arr[j]){
                    ans=Math.max(ans,j-i);
                }
            }
        }
     return ans;
    }
    public static void main(String[] args) {
//        A ramp in an integer array nums is a pair (i, j) for which i < j and nums[i] <= nums[j]. The width of such a ramp is j - i.
       int[] nums = {6,0,8,2,1,5};
        System.out.println(max_ramp(nums));  
    }
}
