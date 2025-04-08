package Sliding_Window.CodeStory;

public class Minimum_size_subaray_sum {
    public static void main(String[] args) {
        int arr[]={2,3,1,2,4,3};
        int n=Integer.MAX_VALUE;
        int sum=0;
        int target=7;
        int i=0,j=0;
        int minl=n;
        while (j<arr.length){
            sum=sum+arr[j];
            while (sum>=target){
                minl=Math.min(minl,j-i+1);
                sum=sum-arr[i];
                i++;

            }

            j++;
        }
        System.out.println(minl);
    }
}
