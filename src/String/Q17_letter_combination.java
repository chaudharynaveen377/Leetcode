package String;

import java.util.*;

public class Q17_letter_combination {
    static ArrayList<String> merge(String str1,ArrayList<String> ans){
        ArrayList<String> lt2=new ArrayList<>();
        for (int i=0;i<ans.size();i++){
            for (int j=0;j<str1.length() ;j++){
                String ch=ans.get(i);
                lt2.add(ch+str1.charAt(j));
            }
        }
        return lt2;
    }
    public static void main(String[] args) {
        String digits="";

        Character num[] = {'2', '3', '4', '5', '6', '7', '8', '9'};
        String mach[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        HashMap<Character, String> mp = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            mp.put(num[i], mach[i]);
        }
        ArrayList<String> ans=new ArrayList<>();
        if (digits.length() != 0) {
            for (int i = 0; i < mp.get(digits.charAt(0)).length(); i++) {
                ans.add(("" + mp.get(digits.charAt(0)).charAt(i)));
            }
        }

int idx=1;
        while (idx!=digits.length() && digits.length()!=0){
            String dummy=mp.get(digits.charAt(idx));
            ans=merge(dummy,ans);
            idx++;
        }

        System.out.println(ans);
    }
}
