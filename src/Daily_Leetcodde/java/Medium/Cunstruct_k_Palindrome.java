package Daily_Leetcodde.java.Medium;

import java.util.HashMap;

public class Cunstruct_k_Palindrome {
    static boolean check_Palindrome(String s){
        int i=0;int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    static int odd_count(String s){
        HashMap<Character,Integer> mp=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),1);
            }
            else {
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
        }
        System.out.println(mp);
        int count=0;
        int i=0;
        int size=0;
        while (  i<s.length()){
            if (mp.get(s.charAt(i))!=null && mp.get(s.charAt(i))%2!=0){
                count++;
                mp.remove(s.charAt(i));
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        String  s = "abcdefff";int k = 2;
        System.out.println(check_Palindrome("abba"));
        System.out.println(odd_count(s));
    }
}
