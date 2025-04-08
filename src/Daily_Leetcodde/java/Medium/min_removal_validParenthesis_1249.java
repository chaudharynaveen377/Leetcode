package Daily_Leetcodde.java.Medium;

import java.util.ArrayList;

public class min_removal_validParenthesis_1249 {
    public static void main(String[] args) {
//
        String s="lee(t(c)o)de)";
        ArrayList<String> lt=new ArrayList<>();
        int count=0;
        String ans="";
        int st=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('){
                count++;
            }
            if (s.charAt(i)==')'){
                count--;
                if (count<0){
                    count=0;
                    continue;
                }
            }

            if (count>=0){
                ans=ans+s.charAt(i);
            }
            if (count==0){
                lt.add(ans.substring(st,ans.length()));
                st=ans.length();
            }
        }
        ans="";
        for (int i=0;i<lt.size();i++){
            ans=ans+lt.get(i);
        }
        System.out.println(ans);

    }
}
