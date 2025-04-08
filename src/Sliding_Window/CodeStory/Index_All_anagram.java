package Sliding_Window.CodeStory;
import java.util.*;
public class Index_All_anagram {

        public static List<Integer> findAnagrams(String s, String p) {
            List<Integer> result = new ArrayList<>();
            if (s.length() < p.length()) return result;

            List<Integer> pCount = new ArrayList<>(26);
            List<Integer> sCount = new ArrayList<>(26);

            // Initialize the lists with zeros
            for (int i = 0; i < 26; i++) {
                pCount.add(0);
                sCount.add(0);
            }
//            String s="cbaebabacd";
//            String t="abc";

            // Populate the frequency lists for the first window
            for (int i = 0; i < p.length(); i++) {
                pCount.set(p.charAt(i) - 'a', pCount.get(p.charAt(i) - 'a') + 1);
                sCount.set(s.charAt(i) - 'a', sCount.get(s.charAt(i) - 'a') + 1);
            }
            System.out.println(pCount);
            System.out.println(sCount);
            // Sliding window
            for (int i = 0; i < s.length() - p.length(); i++) {
                if (matches(pCount, sCount)) {
                    result.add(i);
                }
                sCount.set(s.charAt(i + p.length()) - 'a', sCount.get(s.charAt(i + p.length()) - 'a') + 1);
                sCount.set(s.charAt(i) - 'a', sCount.get(s.charAt(i) - 'a') - 1);
            }

            // Check the last window
            if (matches(pCount, sCount)) {
                result.add(s.length() - p.length());
            }

            return result;
        }

        public static boolean matches(List<Integer> pCount, List<Integer> sCount) {
            for (int i = 0; i < 26; i++) {
                if (!pCount.get(i).equals(sCount.get(i))) return false;
            }
            return true;
        }
        public static List<Integer> findAnagrams2(String s, String p) {
            List<Integer> result = new ArrayList<>();
            if (s.length() < p.length()) return result;

            List<Integer> pCount = new ArrayList<>(26);
            List<Integer> sCount = new ArrayList<>(26);

            // Initialize the lists with zeros
            for (int i = 0; i < 26; i++) {
                pCount.add(0);
                sCount.add(0);
            }
//
//            update frequency for string p
            for (int i=0;i<p.length();i++){
                pCount.set(p.charAt(i)-'a',pCount.get(p.charAt(i)-'a')+1);
            }
            // Populate the frequency lists for the  window
           int i=0;int j=0;

           while (j<s.length()){
               sCount.set(s.charAt(j)-'a',sCount.get(s.charAt(j)-'a')+1);
               if (j-i+1==p.length()){
                  if (matches(pCount,sCount)){
                      result.add(i);
                  }
                   sCount.set(s.charAt(i)-'a',sCount.get(s.charAt(i)-'a')-1);
                  i++;
               }
               j++;
           }
            return result;
        }

    public static void main(String[] args) {
        String s="abab";
        String t="ab";
      List<Integer>lt= findAnagrams2(s,t);
        System.out.println(lt);
    }
}
