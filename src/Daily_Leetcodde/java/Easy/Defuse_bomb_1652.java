package Daily_Leetcodde.java.Easy;

public class Defuse_bomb_1652 {
    static int sum(int []nums,int st,int k){
        int sum=0;
        if (k<0){
            st=st-1;
            for (int i = 0; i < -k; i++) {
                if (st == -1) {
                    st = nums.length-1;
                }
                sum = sum + nums[st--];
            }
        }
        else {
            st=st+1;
            for (int i = 0; i < k; i++) {
                if (st == nums.length) {
                    st = 0;
                }
                sum = sum + nums[st++];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr= {5, 7, 1, 4};int k=3;
        int []ans=new int[arr.length];


//        System.out.println(sum(arr,0,-3));
        int x=0;
        int y=0;
        for (int i=0;i<arr.length;i++){
            y=arr[i];
            arr[i]=sum(arr,i,k)-x;
            x=x+arr[i]-y;

        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
