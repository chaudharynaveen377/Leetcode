package HashMap;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
//        n/2
        int ans=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        int arr[] = {3,3,4};
        for(int i=0;i<arr.length;i++){
            if (!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            if (arr.length%2!=0&&mp.get(arr[i])>=(arr.length+1)/2){
                ans=arr[i];
            }
            if (arr.length%2==0&&mp.get(arr[i])>=(arr.length)/2){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
