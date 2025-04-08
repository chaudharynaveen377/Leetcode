package Sliding_Window.CodeStory;

import java.util.Arrays;

public class Frequency_of_Frqnt_Elmt_1838 {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,9,7,5};
        Arrays.sort(arr);
//        1,2,3,4,5,7,9
//        9,7,1,2,3,4,5
//        frequency of most frequent element
        int count=0;
        int k=5;
        int ans=0;
        int ans1=0;
        for (int i=0;i<arr.length;i++){
            ans=0;
            count=0;
            for (int j=0;j<arr.length;j++){
                if (arr[j]<arr[i]){
                    if (count<k){
                        count=count+arr[i]-arr[j];
                        ans++;
                    }
                }
            }
            System.out.println("idx = "+ i);
            System.out.println("ans= "+ ans);
            ans1=Math.max(ans,ans1);
        }
        System.out.println(ans1);
    }
}
