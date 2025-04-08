package HashMap;

import java.util.HashMap;

public class Largestsubarrayofzerosum {
    public static void main(String[] args) {
        int arr[]={0,0,23};
        int ptr=0,ans=0,brr=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,-1);
        for (int i=0;i< arr.length;i++){
            ptr=ptr+arr[i];
        if (!mp.containsKey(ptr)){
            mp.put(ptr,i);
        }
        else {
            ans=i-mp.get(ptr);
        }
        if (ans>=brr){
            brr=ans;
        }
    }
        System.out.println(brr);
    }
}
