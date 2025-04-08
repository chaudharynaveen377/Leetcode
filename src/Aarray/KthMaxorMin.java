package Aarray;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class KthMaxorMin {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
//        kth max element in 1 loop
//        Integer arr[]={9,8,7,6,5,4,3,2,1};
////        Arrays.sort(arr);
//        Arrays.sort(arr, Collections.reverseOrder());
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter kth element ");
//        int x=sc.nextInt();
//        System.out.println("kth heighest term is "+ arr[x-1]);
//        for(int i=0;i<arr.length-1;i++){
//            System.out.println(arr[i]);
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter kth element ");
        int x=sc.nextInt();
        int y=0;

        for (int i=0;i<x;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<arr.length;j++){
                if (max<=arr[j]){
                    max=arr[j];
                    y=j;
                }
            }
            System.out.println(arr[y]);
            int temp=arr[i];
            arr[i]=arr[y];
            arr[y]=temp;
        }
        System.out.println(x+"th largest element is"+arr[x-1]);
    }
}
