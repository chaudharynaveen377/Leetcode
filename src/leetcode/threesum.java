package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class threesum {
    public static void main(String[] args) {
        int count=0;
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> li=new ArrayList<>();
        HashSet<ArrayList> mp=new HashSet<>();
Arrays.sort(arr);
for (int i=0;i<arr.length;i++){
    int a=i+1;
    int b=arr.length-1;
    while(a<b){
        if (arr[i]+arr[a]+arr[b]==0){
            ArrayList<Integer>st=new ArrayList<Integer>();
            st.add(arr[i]);
            st.add(arr[a]);
            st.add(arr[b]);
            mp.add(st);
            b--;
        } else if (arr[i]+arr[a]+arr[b]>0) {
            b--;
        } else if (arr[i]+arr[a]+arr[b]<0) {
        a++;

        }
    }
}
        System.out.println(mp);
for ( List<Integer> val:mp){
    li.add(val);
}
        System.out.println(li);
    }
}