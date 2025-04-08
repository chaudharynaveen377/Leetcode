package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement2 {
    public static void main(String[] args) {
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        ArrayList<Integer> lt=new ArrayList<>();
        int arr[] = {2,1,1,3,1,4,5,6};
        for(int i=0;i<arr.length;i++){
            if (!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            if (mp.get(arr[i])>=(arr.length+1)/3){
                if (!lt.contains(arr[i])){
                    lt.add(arr[i]);
                }
            }
            if (mp.get(arr[i])>=(arr.length)/3){
                if (!lt.contains(arr[i])){
                    lt.add(arr[i]);
                }
            }
        }
        System.out.println(mp);
        System.out.println(lt);
    }
}
