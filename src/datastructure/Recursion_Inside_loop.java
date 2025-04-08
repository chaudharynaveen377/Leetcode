package datastructure;

public class Recursion_Inside_loop {
    static int fact(int x){
        if (x==0|| x==1) return 1;
        int ans=0;
        for (int i=0;i<3;i++) {
            ans= ans+(x * fact(x - 1));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}
