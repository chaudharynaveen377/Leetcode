package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Lettercombination {
    public static void main(String[] args) {
        String que = "";
        Character num[] = {'2', '3', '4', '5', '6', '7', '8', '9'};
        String mach[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuvw", "xyz"};
        HashMap<Character, String> mp = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            mp.put(num[i], mach[i]);
        }
        ArrayList<String> ar = new ArrayList<>();
        if (que.length() == 2) {
            for (int i = 0; i < mp.get(que.charAt(0)).length(); i++) {
                for (int j = 0; j < mp.get(que.charAt(1)).length(); j++) {
                    ar.add(("" + mp.get(que.charAt(0)).charAt(i) + mp.get(que.charAt(1)).charAt(j)));
                }
            }
        }
        if (que.length() == 1) {
            for (int i = 0; i < mp.get(que.charAt(0)).length(); i++) {
                ar.add(("" + mp.get(que.charAt(0)).charAt(i)));
        }

    }
        System.out.println(ar);

}
}
