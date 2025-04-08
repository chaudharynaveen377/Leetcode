package Daily_Leetcodde.java.Medium;

public class split {
    static long[] prefix(int arr[]){
        long sum=0;
        long ans[]=new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            ans[i]=sum;
        }
        return ans;
    }
    static int logic(long[]arr){
        int ans=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>=arr[arr.length-1]-arr[i]){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,0};
        System.out.println(logic(prefix(nums)));

    }
}
