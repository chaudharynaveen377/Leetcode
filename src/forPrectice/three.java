package forPrectice;

import java.util.ArrayList;
import java.util.HashMap;

public class three {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int ans[]=new int[2];
        int target=9;
        HashMap<Integer,Integer> mp=new HashMap<>();


        for (int i=0;i<arr.length;i++){
            if (mp.containsKey(target-arr[i])){
                ans[1]=i;
                ans[0]=mp.get(target-arr[i]);

            }
            else mp.put(arr[i],i);
        }
        for (int i:ans){
            System.out.println(i);
        }
    }
}
