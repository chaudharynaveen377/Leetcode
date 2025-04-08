package Studymaterial.Arrayquestions;

public class Q_3__Maximum_Subarray {
    public static void main(String[] args) {
       int arr[]= {-2,1};
       int ans=Integer.MIN_VALUE;
        int p1=0;
        int sum=0;
        while (p1!=arr.length){
            sum=sum+arr[p1];

            if (arr[p1]>sum && sum>=ans){
                sum=arr[p1];
                ans=sum;
            }
//            if (sum>=ans){
//                ans=sum;
//            }

            p1++;

        }
        System.out.println(ans);
    }
}
