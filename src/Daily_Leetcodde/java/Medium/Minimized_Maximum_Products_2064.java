package Daily_Leetcodde.java.Medium;

import java.util.ArrayList;

public class Minimized_Maximum_Products_2064 {
    static Boolean check(int x,int []arr , int shops){
       for (int val:arr){
           shops=shops-(val +x-1)/x;
           if (shops<0){
               return false;
           }
       }
       return true;
    }
    static int binary(int[] sum,int l,int r,int n){
        int ans=0;
        while (l<=r){
            int mid=l+(r-l)/2;
            if (check(mid,sum,n)){
                ans=mid;
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
      int  n = 2;
      int [] quantities = {5,7};
      int sum=0;
      int max=0;

      for (int i=0;i< quantities.length;i++){
          sum=sum+quantities[i];
          max=Math.max(max,quantities[i]);

      }
        System.out.println(binary(quantities,1,max,n));
    }
}
