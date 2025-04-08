package Sliding_Window.CodeStory;

import java.util.HashMap;

public class count_occurance_Anagram {
    static boolean check(HashMap<Character,Integer>mp,String t){
        for (int i=0;i<mp.size();i++){
            if (mp.get(t.charAt(i))!=0){
                return false;
            }
        }
        return true;
    }

    static int SlideWindow(String s,String t,HashMap<Character,Integer> mp){
        int ans=0;
        int i=0,j=0;
        while (j<s.length()){
            int size=j-i+1;
            if (mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(j),0);
            }
            if (t.length()==size ){
                if (check(mp,t)){
                    ans++;
                }
                if (mp.containsKey(s.charAt(i))){
                    mp.put(s.charAt(i),1);
                }
                i=i+1;
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="forxxorfxdofr";
        String t="forx";
        HashMap<Character,Integer> mp=new HashMap<>();
        for (int i=0;i<t.length();i++){
            mp.put(t.charAt(i),1);
        }
        System.out.println(SlideWindow(s,t,mp));
//        System.out.println(mp);
//        int count=0;
//        for (int i=0;i<s.length()-t.length()-1;i++) {
//            for (int j = i; j < t.length()+i; j++) {
//                if (mp.containsKey(s.charAt(j))) {
//                    mp.put(s.charAt(j), 0);
//                }
//            }
//            System.out.println(mp);
//            if (check(mp,t)){
//                count++;
//            }
//            if (mp.containsKey(s.charAt(i))){
//                mp.put(s.charAt(i),1);
//            }
//        }
//        System.out.println(count);

    }
}
