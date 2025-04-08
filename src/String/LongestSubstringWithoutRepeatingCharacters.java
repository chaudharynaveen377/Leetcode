package String;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s="aaabbacdba";
//        HashMap<Character,Integer>mp=new HashMap<>();
//        int ans=0,sm=0,asn=0;
//        for (int i=0;i<s.length();i++){
//            char ch=s.charAt(i);
//            if (!mp.containsKey(ch)){
//                mp.put(ch,i+1);
//                ans=ans+1;
//                sm=ans;
//            }
//            else {
//                ans=i+1-mp.get(ch);
////                mp.clear();
//                mp.remove(0,ch);
//                mp.put(ch,i+1);
//                sm=ans;
//            }
//            if (sm>=asn){
//                asn=sm;
//            }
//        }
//        System.out.println(s);
//        System.out.println(asn);
//        System.out.println(mp);

        int right=0,left=0;
        HashSet<Character> seen =new HashSet<>();
        int ma=0;
        while(right<s.length()){
            Character ch=s.charAt(right);
if (seen.add(ch)){

    ma=Math.max(ma,right-left+1);
    right++;
}
else {
    while (s.charAt(left)!=ch){
        seen.remove(s.charAt(left));
        left++;
    }
    seen.remove(ch);
    left++;
}
        }
        System.out.println(ma);
    }
}

