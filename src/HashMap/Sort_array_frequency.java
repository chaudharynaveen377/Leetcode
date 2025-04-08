package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Sort_array_frequency {
    public static void main(String[] args) {
        int arr[]={-1,1,-6,4,5,-6,1,4,1};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        int k=arr.length;
        int ans[]=new int[k];
       for (Map.Entry<Integer,Integer> entry:mp.entrySet()){
//           System.out.println("key=="+entry.getKey());
           int x= entry.getValue();
           while (x!=0){
               ans[--k]= entry.getKey();
               x--;
           }

       }
       for (int x:ans){
           System.out.println(x);
       }
       mp.forEach((key,value)-> System.out.println("key==" +key+", value="+value));
    }
}
