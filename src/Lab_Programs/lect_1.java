package Lab_Programs;

 public class lect_1 {

    static int fact1(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n*fact1(n-1);
    }

    static int fact2(int n){
        if (n==0 || n==1){
            return 1;
        }
        int ans=1;
        for (int i=1;i<=n;i++) {
            ans = ans * i;
        }

        return ans;
    }
    public static void main(String[] args) {
//        String s=4+"d";
//        System.out.println(s.getClass().getSimpleName());
        System.out.println(fact1(5));
        System.out.println(fact2(5));
    }
}
