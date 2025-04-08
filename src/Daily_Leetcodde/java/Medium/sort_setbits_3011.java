package Daily_Leetcodde.java.Medium;

class sort_setbits_3011 {
    static int binarycount_1(int val){
        int ans2=0;
        while (val!=0){
            if (val%2!=0){
                ans2++;
            }
            val=val/2;
        }
        return ans2;
    }
    static boolean check(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j =0; j < nums.length-1; j++) {
                if (binarycount_1(nums[j]) == binarycount_1(nums[j+1]) && nums[j]>nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]>nums[i+1])return false;
        }
        return true;
    }
//    static boolean Approach2(int nums[]){
//        for (int i=0;i<nums.length;i++){
//            
//        }
//    }
    public static void main(String[] args) {
    int nums[]={75,35,34};
        System.out.println(check(nums));
    }
}