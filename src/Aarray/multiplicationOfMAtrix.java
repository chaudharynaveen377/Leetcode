package Aarray;

import java.util.Scanner;

public class multiplicationOfMAtrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[2][2];
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.println("enter "+i+"th rows"+j+"th column");
                int x=sc.nextInt();
                arr[i][j]=x;
            }
        }
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.println(arr[i][j]);
            }
        }
        int brr[][]=new int[2][2];
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.println("enter "+i+"th rows"+j+"th column");
                int x=sc.nextInt();
                brr[i][j]=x;
            }
        }
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.println(brr[i][j]);
            }
        }

    }
}
