package forPrectice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class two {
    static Boolean check(HashMap<Character,Integer> mp,HashMap<Character,Integer> sp,String t){
//        x=1 1 1
//        y=0 0 0

        for (int i=0;i<t.length();i++){
            int x=mp.get(t.charAt(i));
            int y=sp.get(t.charAt(i));
              if (y<x){
                  return false;
              }
            }

      return true;
    }
    static HashMap<Character,Integer> zero(HashMap<Character,Integer> mp ,String t){
        for (int i=0;i<t.length();i++){
            mp.put(t.charAt(i),0);
        }
        return mp;
    }
    static Boolean match2(HashMap<Character,Integer> mp,HashMap<Character,Integer> sp,String t){
        for (int i=0;i<t.length();i++){
            if (mp.get(t.charAt(i))>(sp.get(t.charAt(i)))){
                return  false;
            }
        }
        return true;
    }
    static Boolean finalcheck(HashMap<Character,Integer> mp,HashMap<Character,Integer> sp,String t){

        for (int i=0;i<t.length();i++){
            if (sp.containsKey(t.charAt(i))){
            if (mp.get(t.charAt(i))>sp.get(t.charAt(i))){
                return false;
            }
        }
        else return false;}
        return true;
    }
    public static void main(String[] args) {
//        frequency
//        base cases .............................
            String s = "a", t = "b";
        if (s.equals(t) || s.length()<t.length()){
            System.out.println(s);
            return;
        }
        HashMap<Character,Integer> mp=new HashMap<>();
        HashMap<Character,Integer> sp=new HashMap<>();
        for (int i=0;i<t.length();i++){

            if (!mp.containsKey(t.charAt(i))){
                mp.put(t.charAt(i),1);
            }
            else {
                mp.put(t.charAt(i),mp.get(t.charAt(i))+1);
            }
        }
        for (int i=0;i<s.length();i++){
            if (!sp.containsKey(s.charAt(i))){
               sp.put(s.charAt(i),1);
            }
            else {
                sp.put(s.charAt(i),sp.get(s.charAt(i))+1);
            }
        }
        System.out.println(mp);
        System.out.println(sp);
        if (!finalcheck(mp,sp,t)){
            System.out.println("null0");
            return;
        }

//       base cases   .........................

        sp=zero(sp,t);
                String p=s;
//                String s = "abcdefabc", t = "aabc";
        for (int i=0;i<s.length();i++){
            int j=i;
            while (!check(mp,sp,t) && j<s.length()){
                if (t.contains(s.charAt(j)+"")){
                    sp.put(s.charAt(j),sp.get(s.charAt(j))+1);
                }
                j++;
            }
//            System.out.println(j +" and " +i);
            String ans=s.substring(i,j);
//            System.out.println(ans);
            if (p.length()>=ans.length() && match2(mp,sp,t)){
                p=ans;
            }

            sp=zero(sp,t);


        }

        System.out.println(p);
    }
}
