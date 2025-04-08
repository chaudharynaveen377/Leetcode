package Aarray;

import java.util.ArrayList;

public class Count_Noof_teams {
    public static void main(String[] args) {
//      by using Binarysearch


        int arr[]={1,2,3,4};
        int ans=0;
        for (int i=0;i<=arr.length-3;i++){
            int st=i;
            int p1=st+1;
            int p2=p1+1;
            while (p2<arr.length && p1<arr.length-1){
                if (arr[st]<arr[p1] && arr[p1]<arr[p2] || arr[st]>arr[p1] && arr[p1]>arr[p2] ){
                    ans++;
                }
                p2++;
                if (p2==arr.length){
                    p1=p1+1;
                    p2=p1+1;
                }
            }
        }
        System.out.println(ans);
    }

}
