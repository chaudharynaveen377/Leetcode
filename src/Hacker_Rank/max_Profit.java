package Hacker_Rank;

import java.util.Scanner;

public class max_Profit {
    public static void main(String[] args) {
        int arr[]={1300, 1231 ,940 ,1615, 1839, 1195, 20, 467};
        int ans=0;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                ans=ans+ (arr[i+1]-arr[i]);
            }
        }
        System.out.println(ans);
        Scanner sc=new Scanner(System.in);
    }
}
