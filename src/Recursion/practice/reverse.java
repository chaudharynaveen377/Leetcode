package Recursion.practice;

import Lab_Programs.DSA_Class.Stack.Stack;

import java.util.*;

import static A_Copilot.Permutations.swap;

public class reverse {
//    find the subsets of string
    static void subset(String str,int l,int r){
        if (l==r){
            System.out.println(str);
            return;
        }
        for (int i=l;i<=r;i++){
            str=swap(str,l,i);
            subset(str,l+1,r);
            str=swap(str,l,i);
        }
    }
//    we have to do a dry run of this ?

    static String reverse(String s,int idx){
        if (idx==s.length()){
            return "";
        }
        return reverse(s,idx+1)+s.charAt(idx);
    }
    static String reverse1(String s,int idx){
        if (idx==-1){
            return "";
        }
        return s.charAt(idx)+ reverse1(s,idx-1);
    }
    public static void main(String[] args) {



                //Getting input via STDIN
                Scanner obj = new Scanner(System.in);
                String s1 = obj.next();
                String s2 = obj.next();
                if(s1.length()!=s2.length()){
                    System.out.println("false");
                    return;
                }
                Map<Character,Integer> mp=new HashMap<>();
                for(int i=0;i<s1.length();i++){
                    if(!mp.containsKey(s1.charAt(i))){
                        mp.put(s1.charAt(i),1);
                    }
                    else{
                        mp.put(s1.charAt(i),mp.get(s1.charAt(i))+1);
                    }
                }
                Map<Character,Integer> mp1=new HashMap<>();
                for(int i=0;i<s2.length();i++){
                    if(!mp1.containsKey(s2.charAt(i))){
                        mp1.put(s2.charAt(i),1);
                    }
                    else{
                        mp1.put(s2.charAt(i),mp1.get(s2.charAt(i))+1);
                    }
                }
                for(int i=0;i<s1.length();i++){
                    if(mp.containsKey(s1.charAt(i)) && mp1.containsKey(s1.charAt(i)) && mp.get(s1.charAt(i))!=mp1.get(s1.charAt(i))){
                        System.out.println("false");
                        return;
                    }
                }
                System.out.println("true");



}
}