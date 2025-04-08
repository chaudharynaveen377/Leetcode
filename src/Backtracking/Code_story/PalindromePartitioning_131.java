package Backtracking.Code_story;

import java.util.ArrayList;

public class PalindromePartitioning_131 {
    static ArrayList<ArrayList<Character>> result=new ArrayList<>();
    static void substring(char chr[], int start, ArrayList<Character> lt){

        result.add(new ArrayList<>(lt));
        for (int i=start;i<chr.length;i++){
            lt.add(chr[i]);
            substring(chr,i+1,lt);
            lt.removeLast();
        }
    }
    public static void main(String[] args) {
        String s="abc";
        char chr[]=s.toCharArray();
        substring(chr,0,new ArrayList<>());
        System.out.println(result);

    }
}
