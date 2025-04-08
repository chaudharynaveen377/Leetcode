package Daily_Leetcodde.java.Medium;

import java.util.HashMap;

public class Split_strin_max_1593 {
    public static void main(String[] args) {
        String s = "aa";
//        Output: 5
//        Explanation: One way to split maximally is ['a', 'b', 'ab', 'c', 'cc'].
//        Splitting like ['a', 'b', 'a', 'b', 'c', 'cc']
//        is not valid as you have 'a' and 'b' multiple times.
        int i=0;
        String temp=""; 
        HashMap<String,Integer> mp=new HashMap<>();
        while (i<s.length() ){
            temp=temp+s.charAt(i);
            if (!mp.containsKey(temp)){
                mp.put(temp,1);
                temp="";
            }
            i++;
        }
        System.out.println(mp.size());
//        int arr[]={-1,3,4,5,6,7};
//        int min=Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//           min=Math.max(min,arr[i]);
//        }
//        System.out.println(min);
    }
}
