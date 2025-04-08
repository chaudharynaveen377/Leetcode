package HashMap;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (!mp.containsKey(arr[i])){
                mp.put(arr[i],i);
            }
            else {
                System.out.println("false");
             return;
            }
        }
        System.out.println("true");
    }
}
