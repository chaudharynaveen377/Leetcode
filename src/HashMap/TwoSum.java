package HashMap;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={3,4,1,11,8,5};
        int brr[]={-1};

        int target =13;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int prt=target-arr[i];
            if (mp.containsKey(prt)){
             brr=new int[2];
             brr[0]=i;
             brr[1]=mp.get(prt);
            }
            mp.put(arr[i],i);
        }
        for (int val:brr){
            System.out.println(val);
        }
    }
}
