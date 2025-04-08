package String.CodeStorywithMIke;

import java.util.HashMap;

public class Even_Counts_1371 {
    public static void main(String[] args) {
        String s = "bcbcbc";
//        Output: 13
//        Explanation: The longest substring is "leetminicowor" which contains two each of the vowels:
//        e, i and o and zero of the vowels: a and u.
//                Example 2:
//
//        Input: s = "leetcodeisgreat"
//        Output: 5
//        Explanation: The longest substring is "leetc" which contains two e's.

        int a_count=0;
        int e_count=0;
        int i_count=0;
        int o_count=0;
        int u_count=0;
        int  max_j=0;
        for (int i=0;i<s.length();i++){
//            max_j=0;
            a_count=0;e_count=0;i_count=0;o_count=0;u_count=0;
            for (int j=i;j<s.length();j++){
                switch (s.charAt(j)){
                    case 'a':
                        a_count++;
                    case 'e':
                        e_count++;
                    case 'i':
                        i_count++;
                    case 'o':
                        o_count++;
                    case 'u':
                        u_count++;
                }
                if (a_count%2==0 && e_count%2==0 && i_count%2==0 && o_count%2==0 && u_count%2==0){
//
                    max_j=Math.max(max_j,(j-i+1));
                }
            }


        }
        System.out.println(max_j);
    }
}
