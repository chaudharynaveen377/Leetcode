package Daily_Leetcodde.java.Medium;

public class Power_k_3254 {
    static int check(int [] arr,int i,int j){
        for (int k=i; k <= j-1; k++) {
            if (arr[k+1]!=arr[k]+1){
                return -1;
            }
        }
        return arr[j];
    }
    public static void main(String[] args) {
//        Input: nums = [1,2,3,4,3,2,5], k = 3
//        Output: [3,4,-1,-1,-1]
//        Return an integer array results of size n - k + 1
//      consecutive , sorted in ascending order.
        int nums[]={1};
        int k=1;
int result[]=new int[nums.length-k+1];
int i=0,j=1;
int v=0;
      while (j< nums.length){
      if (j-i==k-1){
          result[v++]=check(nums, i, j);
          i++;
      }
      j++;
      }
      for (int val:result){
          System.out.println(val);
      }
    }
}
