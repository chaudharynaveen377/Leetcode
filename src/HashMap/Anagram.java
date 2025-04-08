package HashMap;

import java.util.HashMap;

public class Anagram {
    static HashMap<Character,Integer> makefreq(String str){
        HashMap <Character,Integer >mp =new HashMap<>();
        for (int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if (!mp.containsKey(i)){
                mp.put(ch,1);
            }
            else {
                mp.put(ch,mp.get(i)+1);
            }
        }
        return mp;
    }
    public static void main(String[] args) {
       String s1="listen";
       String s2="silent";
HashMap<Character,Integer> mp1=makefreq(s1);
HashMap<Character,Integer> mp2=makefreq(s2);
        System.out.println(mp1.equals(mp2));
    }
}
