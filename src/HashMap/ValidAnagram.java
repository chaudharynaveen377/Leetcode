package HashMap;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagarm";
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                mp.put(ch, mp.get(ch) + 1);
            }
        }
        System.out.println(mp);
        for (int i = 0; i < t.length(); i++) {
            char ch1 = t.charAt(i);
            if (mp.containsKey(ch1)) {
                mp.put(ch1, mp.get(ch1) - 1);
            }
            if (mp.containsValue(0)){
                mp.remove(ch1,0);
            }
        }
        System.out.println(mp);
        if (mp.isEmpty()){
            System.out.println("true");
        }
        else System.out.println("False");
    }
}
