package Lab_Programs.DSA_lab;

import java.util.Scanner;

public class lact_1_p2 {
  static   class node{
        int a;
        int b;
        node(int a,int b){
            this.a=a;
            this.b=b;
        }
        public  int add(){
            return this.a+this.b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        node obj1=new node(a,b);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.add());
    }
}
