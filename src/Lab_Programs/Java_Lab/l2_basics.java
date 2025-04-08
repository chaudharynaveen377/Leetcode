package Lab_Programs.Java_Lab;

import java.util.Scanner;

public class l2_basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ;");
        int a=sc.nextInt();
        System.out.println("enter a number ;");
        int b=sc.nextInt();

        int c;
        c=a+b;
        System.out.println(c);

        System.out.println("enter a radius : ");
        int r=sc.nextInt();
       sc.close();
        System.out.println((int) (3.14*Math.pow(r,2)));

    }
}
