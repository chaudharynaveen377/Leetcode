package Recursion;

import java.util.Scanner;

public class NthPower {
    static double pow(double x,int y){
        if (y==0){
            return 1;
        }
        if (y%2==0){
            System.out.println(x);
            return pow(x*x,y/2);

        }
        else {
            return x*pow(x*x,(y-1)/2);
        }
    }
    public static void main(String[] args) {
        double x=2;
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        System.out.println(pow(x,y));
    }
}
