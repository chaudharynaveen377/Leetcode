package Recursion;

import java.util.Scanner;

  public class fabinaco {
    static int  fab(int y){
        if (y==1||y==0){
        return y;}
        int x=fab(y-1)+fab(y-2);
        return x;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int x=sc.nextInt();
        System.out.println( fab(x));
    }
}
