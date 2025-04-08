package A_Copilot;

import java.util.Arrays;
import java.util.HashSet;

public class all_combination {
  static   HashSet<String> st=new HashSet<>();
    static String swap(String s,int i,int j){
       char[] cr=s.toCharArray();
       char temp=cr[i];
       cr[i]=cr[j];
       cr[j]=temp;
       return new String(cr);
    }

    static void comb(String s, int j){
        if (j>=s.length()){
            st.add(s);
            System.out.println(s);
            return;
        }
        for (int i=0;i<s.length();i++){
              s= swap(s,i,j);
               comb(s,j+1);
           s= swap(s,i,j);
        }
    }
    public static void main(String[] args) {
       String s="abc";
        System.out.println(swap(s,0,1));
        comb(s,0);
        System.out.println(st);
    }
}
