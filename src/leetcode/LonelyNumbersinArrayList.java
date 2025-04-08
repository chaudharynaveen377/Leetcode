package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LonelyNumbersinArrayList {
    public static void main(String[] args) {
        int arr[]={10,6,5,8};
        ArrayList<Integer>lst=new ArrayList<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int val:arr){
            if (!mp.containsKey(val)){
                mp.put(val,0);
            }
            else {
                mp.put(val,mp.get(val)+1);
            }
        }
        for (int val:mp.keySet()){
            if (!mp.containsKey(val-1) && !mp.containsKey(val+1) && mp.get(val)==0){
                lst.add(val);
            }
        }
        System.out.println(lst);
    }
}
