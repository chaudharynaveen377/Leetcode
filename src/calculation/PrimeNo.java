package calculation;
import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
       if (num==0 || num==1){
           System.out.println("not a prime number");
           return ;
       }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("not a prime number");
                return;
            }
        }
        System.out.println("prime number");
    }
}