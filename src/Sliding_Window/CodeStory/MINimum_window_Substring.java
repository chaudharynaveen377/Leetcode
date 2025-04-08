package Sliding_Window.CodeStory;

import HashMap.Lettercombination;

import java.util.ArrayList;
import java.util.List;

public class MINimum_window_Substring {
    //t= 1 1 1
    //s= 0 0 0
    static boolean match(List<Integer> Tcount,List<Integer> Scount,String s,String t){

       for (int i=0;i<t.length();i++){
         int x=  Scount.get(t.charAt(i)-'a');
         int y=  Tcount.get(t.charAt(i)-'a');
         if (x<y)return false;
       }
        return true;
    }
    static boolean match2(List<Integer> Tcount,List<Integer> Scount){
        for (int i=0;i<26;i++){
            if (Tcount.get(i)!=Scount.get(i)){
                return false;
            }

        }
        return true;
    }
    static List<Integer> zeroAl(List<Integer> Scount){

        for (int i=0;i<26;i++){
            Scount.set(i,0);
        }
        return Scount;
    }
    public static void main(String[] args) {
       String s = "abcdefabc", t = "abc";

        List<Integer> Tcount=new ArrayList<>();
        List<Integer> Scount=new ArrayList<>();

//       base cases
         if (t.length()>s.length()){
             System.out.println("null");
             return;
         }
        for (int i=0;i<26;i++){
           Tcount.add(0);
            Scount.add(0);
        }
        for (int i=0;i<t.length();i++){
           Tcount.set(t.charAt(i)-'a',Tcount.get(t.charAt(i)-'a')+1);
        }
        for (int i=0;i<s.length();i++){
           Scount.set(s.charAt(i)-'a',Scount.get(s.charAt(i)-'a')+1);
        }
        if (!match(Tcount,Scount,s,t)){
            System.out.println("null");
            return;
        }
String p=s;
        Scount=zeroAl(Scount);
        for (int i=0;i<s.length();i++){
            int j=i;
            if (t.contains(s.charAt(i)+"" )){
                while (!match(Tcount,Scount,s,t) && j<s.length()){
                    if (t.contains(s.charAt(j)+"" )) {
                        Scount.set(s.charAt(j) - 'a', Scount.get(s.charAt(j) - 'a') + 1);
                    }
                    j++;
                }

                String ans=s.substring(i,j);

                if (p.length()>=ans.length() && match2(Tcount,Scount)){
                    p=ans;
                }
                Scount=zeroAl(Scount);
            }
        }
        System.out.println(p);

    }
}
