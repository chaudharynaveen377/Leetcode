package Aarray;

public class maximum_product_subarray {
    public static void main(String[] args) {
    int arr[] = {2,3,-2,4};
    int n=arr.length;
    int sum=1;
    int ans=0;
    int size=n*(n-1)/2;
    for (int i=0;i<n;i++){
        for (int j=i;j<n;j++){
            sum=sum*arr[j];
            ans=Math.max(ans,sum);
        }
        sum=1;
    }
        System.out.println(ans);
}
}
