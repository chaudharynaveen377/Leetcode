package OOPS;
import java.util.Scanner;
class algebra{
    int x=23;
     int  add(int x,int y){
        return x+y;
    }
}
public class algebraclass {
    public static void main(String[] args) {
        algebra alg=new algebra();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(alg.add( a, b));
        System.out.println(alg.x);

    }
}
