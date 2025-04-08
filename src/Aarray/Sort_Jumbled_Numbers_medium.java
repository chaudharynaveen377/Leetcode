package Aarray;

import java.util.*;

public class Sort_Jumbled_Numbers_medium {
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());}}
        );
        HashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    private static int jumble_number(int[] mapping, int pivot) {
        int ans=0;
        int d_ans=0;
        while (pivot!=0){
//            pivot==991
           int last_digit=mapping[pivot%10];
           ans=ans*10+last_digit;
           pivot=pivot/10;
        }
        while (ans!=0){
            int last_digit=ans%10;
            d_ans=d_ans*10+last_digit;
            ans=ans/10;
        }

        return d_ans;
    }


public static void main(String[] args) {
        int mapping[] = {0,1,2,3,4,5,6,7,8,9};
        int nums[] = {789,456,123};

//        Map the number 991 as follows:
//        1. mapping[9] = 6, so all occurrences of the digit 9 will become 6.
//        2. mapping[1] = 9, so all occurrences of the digit 1 will become 9.
//        Therefore, the mapped value of 991 is 669.
//        338 maps to 007, or 7 after removing the leading zeros.
//        38 maps to 07, which is also 7 after removing leading zeros.
//        Since 338 and 38 share the same mapped value, they should remain in the same relative order, so 338 comes before 38.
//        Thus, the sorted array is [338,38,991].
    HashMap<Integer,Integer>mp=new HashMap<>();
    HashMap<Integer,Integer>sortedMap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int pivot = nums[i];
            mp.put(nums[i],jumble_number(mapping,pivot));
        }
    sortedMap=  sortByValue(mp);
    System.out.println(sortedMap);
    int i=0;
    for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
       nums[i]= entry.getKey() ;
       i++;
    }
for (int j:nums){
    System.out.println(j);
}
    }

}