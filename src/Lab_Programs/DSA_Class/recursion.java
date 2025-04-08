package Lab_Programs.DSA_Class;

import java.util.Arrays;
import java.util.Collections;

public class recursion {
    static void fun(int n){
        if (n>0){
            System.out.println(n);
            fun(n-1);
            fun(n-1);
        }
    }
    public static void main(String[] args) {
//        fun(3);
        int arr[]={2,5,8,6,3,8,0};
        Arrays.sort(arr);

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){

            }
            System.out.println(arr[i]);
        }
    }
}
