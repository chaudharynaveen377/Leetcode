package Aarray;

public class min_mergeOperation_palindrom_Array {
    static int [] merge_sum(int arr[],int i,int j){
//        int arr[]={11,12,13,11};
//        i=2  ,j=3
        int sum=arr[i]+arr[j];
        int ans[]=new int[arr.length-1];

        int k=0;
        for ( k=0;k<i;k++){
            ans[k]=arr[k];
        }
        ans[k++]=sum;
        for (k=k;k< ans.length;k++){
            ans[k]=arr[++j];
        }
        return  ans;
    }
    public static boolean check_palindrome(int[] arr) {
        int st=0;
        int end=arr.length-1;
        while (st<end){
            if (arr[st]!=arr[end]){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
static int min_operations(int []arr){
       int p1=0;
       int p2=arr.length-1;
       int ans=0;
       while (p1<p2){
           if (arr[p1]==arr[p2]){
               p1++;
               p2--;
           }
           if (arr[p1]<arr[p2]){
               arr=merge_sum(arr,p1,p1+1);
               p2--;
               ans++;
           }
           if (arr[p2]<arr[p1]){
               arr=merge_sum(arr,p2-1,p2);
               p2--;
               ans++;
           }

       }
        return ans;
}

    public static void main(String[] args) {
        int arr[]={2,6,3,5};
        System.out.println(check_palindrome(arr));

      int brr[]=  merge_sum(arr,2,3);
      for (int x :brr){
          System.out.println(x);
      }
        System.out.println(min_operations(arr));

    }

 }
