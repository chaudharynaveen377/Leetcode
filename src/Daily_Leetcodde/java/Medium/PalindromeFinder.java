package Daily_Leetcodde.java.Medium;

import java.util.*;

public class PalindromeFinder {
    static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; }
            start++;
            end--;
        }
        return true;
    }

    static int logic(String str) {
//        A B C B A
        Set<String> st=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            int j=str.length()-1;
            boolean flag=false;
            while (str.charAt(j)!=str.charAt(i)){
                j--;
                flag=true;
            }
            if (flag=true && j-i>=2){
                int k=i+1;
                while (k<j ){
                    String ans= ""+str.charAt(i)+str.charAt(k)+str.charAt(j);
                    st.add(ans);
                    k++;
                }
            }
        }
        System.out.println(st);
         return st.size();
    }
    public static void main(String[] args) {
        String str = "adc";
        int result = logic(str);
        System.out.println("Number of palindromic substrings of length 3: " + result);
    }


}
