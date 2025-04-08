package leetcode;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[]={100,4,200,3,2};
        int k=0;
        int count=0;
        int ans=0,idx=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        System.out.println(mp);
        for(int val:arr){
            mp.put(val,k++);
        }
    
    }
}
