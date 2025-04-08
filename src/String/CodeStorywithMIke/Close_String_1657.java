package String.CodeStorywithMIke;

import java.util.*;

public class Close_String_1657 {
    public static void main(String[] args) {
      String s1=  "abbzzca";
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        s1 = new String(charArray);

       String s2= "babzzcz";
       charArray = s2.toCharArray();
        Arrays.sort(charArray);
        s2=new String(charArray);

        HashMap<Character,Integer> mp=new HashMap<>();
        for (int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);

               if (!mp.containsKey(ch)){
                   mp.put(ch,1);
               }
               else mp.put(ch,mp.get(ch)+1);
        }
        ArrayList<Integer> lt=new ArrayList<>();
        char ch='-';
        for (int i=0;i<s1.length();i++){
            if (ch!= s1.charAt(i)){
                lt.add(mp.get(s1.charAt(i)));
                ch=s1.charAt(i);
            }
        }
 mp=new HashMap<>();
        for (int i=0;i<s2.length();i++){
            char ch1=s2.charAt(i);

               if (!mp.containsKey(ch1)){
                   mp.put(ch1,1);
               }
               else mp.put(ch1,mp.get(ch1)+1);
        }
        ArrayList<Integer> lt1=new ArrayList<>();
         ch='-';
        for (int i=0;i<s2.length();i++){
            if (ch!= s2.charAt(i)){
                lt1.add(mp.get(s2.charAt(i)));
                ch=s2.charAt(i);
            }
        }
       Collections.sort(lt);
       Collections.sort(lt1);
        System.out.println(lt.equals(lt1));
    }
}
