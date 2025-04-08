package HashMap;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
//        int check=Maximum sum of subarray
        int sum=0;
        int ans=0;
for (int i=0;i<arr.length;i++){
    for (int j=i;j<arr.length;j++){
        sum=sum+arr[j];
        if (sum>=ans){
            ans=sum;
        }

    }
    sum=0;
}
        System.out.println(ans);
    }
}
