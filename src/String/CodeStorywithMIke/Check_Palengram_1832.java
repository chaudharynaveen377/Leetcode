package String.CodeStorywithMIke;

import java.util.HashMap;
import java.util.HashSet;

public class Check_Palengram_1832 {

        public static int g(int n) {
            // Base case
            if (n == 0) {
                return 1;
            }
            // Recursive case
            return n*g(n - 1) ;
        }




    static Boolean check(String s){
for (int i=0;i<26;i++){
    if (!(s.contains(""+(char)(97+i)))){
return false;
    }
}

        return true;
    }
    public static void main(String[] args) {
        String s="abcdefghijkllnopqrstuvwxyznkjnlk";
        System.out.println(g(3));

    }
}
