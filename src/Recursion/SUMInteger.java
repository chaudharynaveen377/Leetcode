package Recursion;

public class SUMInteger {
    static int sum(int x){
        if (x==0){
            return 0;
        }
        int ans=x%10+sum(x/10);
        return ans;
    }
    public static void main(String[] args) {
        int x=1234;
        System.out.println( sum(x));
    }
}
