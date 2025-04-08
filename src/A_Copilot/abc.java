package A_Copilot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class abc {
static ArrayList<Integer> freq(int arr[]){
    ArrayList<Integer>lt=new ArrayList<>();
    for (int k : arr) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (k == arr[j]) {
                count++;
            }
        }
        lt.add(count);
    }
    return lt;
}
    public static void main(String[] args) {
      Map<Integer,Integer> mp=new HashMap<>();
int arr[]={1,2,3,1,2,3,4,1};
        for (int i=0;i<arr.length;i++){
            if (!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else {
                mp.put(arr[i],(mp.get(arr[i])+1));
            }
        }

        System.out.println(freq(arr));
    }
}
