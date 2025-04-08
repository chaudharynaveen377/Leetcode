package leetcode;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int str=num;
        int x=0;
        int digit=0;
        while(num!=0){
            digit=num%10;
            x=x+(digit*digit*digit);
            num=num/10;
        }
        if(str==x){
            System.out.println("armstrong number");
        }
        else System.out.println("not a armstrong");
    }
}
