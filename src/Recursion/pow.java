package Recursion;

public class pow {

        public static int gcd(int a, int b) throws Exception {
            // Base case: when b becomes 0, gcd is a
            if (a==0 && b==0){
               throw new Exception("value error");
            }
            if (b == 0) {
                return a;
            }
            if (a==0){
                return b;
            }
            return gcd(b, a % b);

    }
    static int power(int n,int m){
        if (m==0){
            return 1;
        }
        return n*power(n,m-1);
    }
    public static void main(String[] args) throws Exception {
//        System.out.println(power(5,4));
        try {
            System.out.println(gcd(15,100));

        }
        catch (Exception e ){
            System.out.println("an excption occur: "+e.getMessage());
        }

    }
}
