package Daily_Leetcodde.java.Medium;

import java.util.HashMap;

public class String_Compression_iii_3163 {
    static String solve(String word){
        String comp="";
        if (word.length()==0)return word;
//        frequency array or map
        HashMap<Character,Integer> mp=new HashMap<>();
for (int i=0;i<word.length();i++){
    if (!mp.containsKey(word.charAt(i))){
        mp.put(word.charAt(i),1);
    }
    else {
        mp.put(word.charAt(i),mp.get(word.charAt(i))+1);
    }
}
int i=0;
while (i<word.length()){
    if (mp.get(word.charAt(i))>9){
        comp=comp+"9"+word.charAt(i);
        mp.put(word.charAt(i),Math.abs(mp.get(word.charAt(i))-9));
        i=i+9;
    }
    else {
        comp=comp+mp.get(word.charAt(i))+word.charAt(i);
        i=i+mp.get(word.charAt(i));
    }
}
        return comp;
    }
    static String sliding_window(String word){
        word=word+"*";
        StringBuilder comp=new StringBuilder();
        int j=0;int i=1;
        while (i<word.length()){
            char ch1=word.charAt(i);
            char ch2=word.charAt(j);
            if (ch1==ch2){
                if (i+1-j==9){
                    comp.append("9"+ch2);
                    j=i+1;
                    i++;
                }
            }
            else {
                comp.append(i - j);
                 comp.append(ch2);
                j=i;
            }
            i++;
        }
        return comp.toString();
    }
    public static void main(String[] args) {
        String word = "abab";
//
        System.out.println(sliding_window(word));
    }
}
