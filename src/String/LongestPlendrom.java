package String;

import java.util.HashMap;

public class LongestPlendrom {
    public static void main(String[] args) {
        StringBuilder anright=new StringBuilder();
        String s="abccbaa";
        String ans="";
        String ns="";

        System.out.println(ans);
        int left=0,right=s.length()-1;
        for (int i=0;i<s.length();i++){
            left=i;
            right=s.length()-1;
                while(left!=right) {
                    if (s.charAt(left) == s.charAt(right)) {
                        if (s.charAt(left)==s.charAt(right)&& (left+1==right)){
                         ans=ans+s.charAt(left)+s.charAt(right)+anright.reverse();
                                 break;
                        }
                        ans=ans+s.charAt(left);
                        anright.append(s.charAt(right));

                        right--;
                        left++;
                        if (left==right || left>right){
                            ans=ans+s.charAt(left)+anright.reverse();
                            break;
                        }
                    }
                    else {
                        left=i;
                       right--;
                       ans="";
                       anright.delete(0,anright.length());
                    }
                }
                if (ans.length()>=ns.length()){
                    ns=ans;
                }

        }
        System.out.println(ns);
    }
}
