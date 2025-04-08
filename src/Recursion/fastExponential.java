package Recursion;

public class fastExponential {
        public static long power(long a, long b) {
            if (b == 0) {
                return 1;
            }
            long halfPower = power(a, b / 2);
            if (b % 2 == 0) {
                return halfPower * halfPower;
            } else {
                return a * halfPower * halfPower;
            }
        }
        public static void main(String[] args) {
            long a = 160000;
            long b = 6;
            System.out.println(a + "^" + b + " = " + power(a, b)); // Output: 1024
        }
}
