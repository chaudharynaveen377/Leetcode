package Daily_Leetcodde.java.Hard;

public class Shorted_subarray_862 {
    static int sub( int []nums,int k){
        int i=0,j=1,ans=Integer.MAX_VALUE;
        while (j<nums.length && i<j){
            if (nums[j]>=k){
                return 1;
            }
            if (ans<=(j-i+1)){
                i++;
            }
            if (sum(nums,i,j)<k){
                j++;
            }
            else  {
                ans=(j-i+1);
                j++;

            }
        }
       return (ans==Integer.MAX_VALUE) ? -1 : ans;
    }
    static int sub2( int []nums,int target){
//        int ans=0;
        int k=0;
        for (int i=0;i< nums.length;i++){
            for (int j=0;j< nums.length-k;j++){
                if (sum(nums,j,k+j)>=target){
                    return k+1;
                }
            }
            k++;
        }

        return -1;
    }
    static int sub3(int[] nums, int target) {
        int i = 0, j = 1, ans = Integer.MAX_VALUE;

        while (j < nums.length) {
            if (nums[j] >= target) return 1;

            long t1 = sum(nums, i, j); // Use long for t1 to handle large sums
            if (j >= nums.length - 1) {
                int ch = check(nums, i, j, target, t1, ans);
                ans = Math.min(ans, ch);
                return ans;
            }

            if (t1 >= target) {
                int ch = check(nums, i, j - 1, target, t1 - nums[j], j - i + 1);
                ans = Math.min(ans, ch);
                i = j - ans + 2;
            }

            j++;
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }

    private static int check(int[] nums, int i, int j, int k, long t1, int ans) {
        while (i < j) {
            if (t1 >= k) {
                ans = Math.min(ans, j - i + 1);
            }
            if (nums[i] > nums[j]) {
                t1 = t1 - nums[j];
                j--;
            } else {
                t1 = t1 - nums[i];
                i++;
            }
        }
        return ans;
    }

    private static long sum(int[] nums, int i, int j) {
        long ans = 0; // Use long to avoid overflow
        for (int l = i; l <= j; l++) {
            ans = ans + nums[l];
        }
        return ans;
    }


    public static void main(String[] args) {
//        Input: nums = [2,-1,2], k = 3
//        Output: 3
//        cant srt
        int nums[]={17985,-36292,-23941,80618,20594,-6181,9181,65796,-25716,66593,-6873,34062,29878,852,-4767,-36415,11783,8085,-41063,-39940,74284,66272,82385,51634,-48550,9028,-30777,86509,44623,9413,-38369,-1822,46408,35217,72635,-16560,85373,52105,39477,3852,45974,-21593,15481,47280,73889,-42981,54978,95169,-19615,93133};
        int k=387303;
//        System.out.println(sub(nums,k));
//        System.out.println(sub2(nums,k));
        System.out.println(sub3(nums,k));
//        System.out.println(check(nums,0,4,k,sum(nums,0,4)));

        System.out.println(sum(nums,0,48));
        System.out.println(49-37+1);
    }

}
