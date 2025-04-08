package Sliding_Window.CodeStory;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Max_no_of_Vowels_1456 {
    static boolean isVowels(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static void main(String[] args) {
        String s="aeiou";
        int r=2;
        int i=0,j=0;
        int ans=0;
        int count=0;
        while (j<s.length()){
            if (isVowels(s.charAt(j))){
                count=count+1;
            }
            if (j-i+1==r){
                ans=Math.max(ans,count);
                if (isVowels(s.charAt(i))){
                    count--;
                }
                i++;
            }
            j++;
        }
        System.out.println(ans);
    }
}
