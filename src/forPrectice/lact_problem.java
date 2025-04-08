package forPrectice;

import java.util.Scanner;

public class lact_problem {

//    using recursion
    static int factorial(int num){
        if (num==0 || num==1){
            return 1;
        }
        return num*factorial(num-1);
    }

//    using iterative
    static int fact2(int num){
        if (num==0 || num==1){
            return 1;
        }
        int ans=1;
        for (int i=num;i>1;i--){
            ans=ans*i;
        }
        return ans;
    }
    static void pattern(){
for (int i=0;i<5;i++){
    for (int j=0;j<5;j++){
        if (i==0 ||i==4 ||j==0 || j==4) {
            System.out.print("*");
        }
        System.out.print("  ");
    }
    System.out.println();
}
    }
    static int arrIndx(int arr[],int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(factorial(n));
//        System.out.println(fact2(n));
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(arrIndx(arr,5));
        pattern();
    }
}
