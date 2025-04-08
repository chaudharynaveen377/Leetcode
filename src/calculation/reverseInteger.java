package calculation;

import java.awt.datatransfer.StringSelection;

public class reverseInteger {
    static boolean checkPalindrome(String s){
      StringBuilder st=new StringBuilder(s.substring((s.length()-1)/2));
        String a1=st.reverse().toString(), a2=s.substring(0,s.length()/2+1);
      if (a1.equals(a2)){
          return true;
      }
      return false;
    }
    public static void main(String[] args) {
        int x=123456;
        int ans=0;
        while (x!=0){
            ans=ans*10+x%10;
            x=x/10;
        }
        System.out.println(ans);
        String s="acba";
//        System.out.println(s.substring(0,s.length()));
//        StringBuilder st=new StringBuilder();
        System.out.println(checkPalindrome(s));
    }
}
