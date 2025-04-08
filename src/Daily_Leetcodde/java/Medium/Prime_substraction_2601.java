package Daily_Leetcodde.java.Medium;

public class Prime_substraction_2601 {
    static Boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i]) {
                return false;}}
        return true;}
    static int arr[] = new int[1000];
    static int prime(int n) {
        if (arr[n] != 0) {
            return arr[n];
        }
        int count = 0;
        int x = 2;
        while (count != 1000) {
            boolean flag = true;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[count] = x;
                count++;
            }
            x++;
        }
return arr[n];
    }
    static void disp(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int [] nums={5,8,3};
        System.out.println(isSorted(nums));
       int i=nums.length-2;
       while (i>=0 && nums.length>1 && !isSorted(nums)){
           int j=0;
           while (nums[i]>=nums[i+1] && prime(j)<nums[i]){
              if (nums[i]-prime(j)<nums[i+1] ){
                  nums[i]=nums[i]-prime(j);
                  break;
              }
              j++;
           }
           i--;
       }
       disp(nums);
        System.out.println(isSorted(nums));
    }
}
