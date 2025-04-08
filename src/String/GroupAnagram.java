package String;

import java.util.*;

public class GroupAnagram {
    public static  List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);

            String sorted = new String(charArray);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String str[]={"abc","cba"};
      List<List<String>> lt=groupAnagrams(str);
        System.out.println(lt);
        char[] charArray = {};
        for (String s : str) {
            charArray = s.toCharArray();
            Arrays.sort(charArray);}
        for (char ch:charArray){
            System.out.println(ch);
        }

    }
}
