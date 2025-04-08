package Lab_Programs.DSA_lab;

import java.util.Scanner;

public class lect_1 {
    static int [][] multiply(int [][]arr1,int arr2[][]){
        if (arr1.length!=arr2.length || arr1[0].length!=arr2[0].length){
            System.out.println("multiplication not possible");
            return new int[0][0];
        }
        int ans[][]=new int[arr1.length][arr1[0].length];
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j< arr1[0].length;j++){
                ans[i][j]=helper(arr1,arr2,i,j);
            }
        }
        return ans;
    }
    static int helper(int arr[][],int arr1[][],int i,int j){
        int x=0;
        for (int k=0;k<arr.length;k++){
            x=x+arr[i][k]*arr1[k][j];
        }
        return x;
    }
    static int [][] Add(int [][]arr1,int arr2[][]){
        if (arr1.length!= arr2.length || arr1[0].length!= arr2[0].length){
            System.out.println("addtion  not possible");
            return new int[0][0];
        }
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j< arr1[0].length;j++){
                arr1[i][j]=arr1[i][j]+arr2[i][j];
            }
        } 
        return arr1;
    }
    static int Index_array(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1; // element not found

    }
    static int fact(int x){
        if (x==0 || x==1){
            return 1;
        }
        return x*fact(x-1);

    }
    static void print2d(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[0].length;j++){
                System.out.print( " "+arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int arr[]={1,5,7,9,8,3};

        int target=12;
        String str=(Index_array(arr,target)==-1)?"index not in array " : "index of "+target+" is " +Index_array(arr,target);
        System.out.println(str);

        int arr1[][]={{1,2,3}
                ,
                {7,8,9}};
        int arr2[][]={{1,2,3}
                   ,
                    {7,8,9}};

        int [][] add= Add(arr1,arr2);
        System.out.println("sum of matrix arr1 and arr2 is ");
        print2d(add);

        System.out.println("\nmultiply of two matrix : ");
        int[][] mult=multiply(arr1,arr2);
        print2d(mult);


    }
}
