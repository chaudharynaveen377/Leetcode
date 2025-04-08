package Aarray;

import java.util.ArrayList;

public class jucky_No {
    public static int lucky_number(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (max_column(arr,arr[i][j]) && min_row(arr,arr[i][j])){
                    return arr[i][j];
                }
            }

        }
        return -1;
    }
    public static boolean max_column(int [][]arr,int check){
        for (int i=0;i<arr[0].length;i++){
            int max=Integer.MIN_VALUE;
            for (int j=0;j<arr.length;j++){
                if (max<=arr[j][i]){
                    max=arr[j][i];
                }
            }
            if (max==check){
                return true;
            }
        }
        return false;
    }
    public static boolean min_row(int [][]arr,int check){
        for (int i=0;i<arr.length;i++){
            int min=Integer.MAX_VALUE;
            for (int j=0;j<arr[0].length;j++){
                if (min>=arr[i][j]){
                    min=arr[i][j];
                }
            }
            if (min==check){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{3,7,8},{9,11,13},{15,16,17}};
//   3,7,8
//   9,11,13
//   15,16,17
        System.out.println(lucky_number(arr));
        ArrayList<Integer> lt=new ArrayList<>();

    }
}
