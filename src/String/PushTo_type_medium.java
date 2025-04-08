package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PushTo_type_medium {
    public static void main(String[] args) {
        String s="aabbccddeeffgghhiiiiii";
        HashMap<Character,Integer>mp=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else mp.put(ch,mp.get(ch)+1);
        }
        System.out.println(mp);
        Integer arr[]=new Integer[mp.size()];
        int idx=0;
        for (char ch :mp.keySet()){
            arr[idx++]=mp.get(ch);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int ans=0;
        int real=0;
        int j=0;
       for (int i=0;i<=mp.size()/8;i++){
           while (j<8*(i+1) && j<mp.size()){
               ans=ans+arr[j]*(i+1);
               j++;
           }
        real =real+ans;
           ans=0;
       }
        System.out.println(real);
    }
}
