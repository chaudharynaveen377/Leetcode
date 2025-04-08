package Aarray;

import java.util.ArrayList;
import java.util.HashMap;

public class valid_Sudoku_medium {
    static boolean validrows(int [][] arr){

        for (int i=0;i<9;i++){
            ArrayList<Integer> lt =new ArrayList<>();
            for (int j=0;j<9;j++){
                if (!lt.contains(arr[i][j]) || arr[i][j]==0){
                    lt.add(arr[i][j]);
                }
                else return false;
            }
        }
        return true;
    }
    static boolean validcolumn(int [][] arr){

        for (int i=0;i<9;i++){
            ArrayList<Integer> lt =new ArrayList<>();
            for (int j=0;j<9;j++){
                if (!lt.contains(arr[j][i]) || arr[j][i]==0){
                    lt.add(arr[j][i]);
                }
                else return false;
            }
        }
        return true;
    }
    static boolean validmatrix(int arr[][]){
       for (int sr=0;sr<9;sr+=3) {
           int er = sr + 2;

           for (int sc = 0; sc < 9; sc += 3) {
               int ec = sc + 2;
               if (traversal(arr,sr,er,sc,ec)==false){
                   return false;
               }
           }
       }
        return true;
    }
    static boolean traversal(int arr[][],int sr,int er,int sc,int ec){
        ArrayList<Integer> lt=new ArrayList<>();
        for (int i=sr;i<=er;i++){
            for (int j=sc;j<=ec;j++){
                if (!lt.contains(arr[i][j]) || arr[i][j]==0){
                    lt.add(arr[i][j]);
                }
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[][]={{5,3,1,0,7,0,0,0,0},
                     {6,1,0,0,9,5,0,0,0},
                     {0,9,8,0,0,0,0,6,0},
                     {8,0,0,0,6,0,0,0,3},
                     {4,0,0,8,0,3,0,0,1},
                     {7,0,0,0,2,0,0,0,6},
                     {0,6,0,0,0,0,2,8,0},
                     {0,0,0,4,1,9,0,0,5},
                     {0,0,0,0,8,0,0,7,9}};

//        approach one brute force
//        step 1 - run loop for valid rows
//        stemp 2 - run loop for valid columns
//        step 3 - check for 3*3 valid matrrix

        System.out.println(validrows(arr) && validcolumn(arr) && validmatrix(arr));
      

    }
}
