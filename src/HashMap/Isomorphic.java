package HashMap;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s1="aabac";
        String s2="xxyxy";

        HashMap<Character,Character> mp=new HashMap<>();
        if (s1.length()!=s2.length()){
            System.out.println("false");
            return ;
        }
        for (int i=0;i<s1.length();i++){
            Character ch=s1.charAt(i);
            Character ch1=s2.charAt(i);
            if (mp.containsKey(ch)) {
                if (mp.get(ch) != ch1) {
                    System.out.println("false");
                    return;
                }
            }
                else if (mp.containsValue(ch1)) {
                    System.out.println("false");
                    return;
                }


            else {
                mp.put(ch,ch1);
            }

        }
        System.out.println("true");
    }
}
