package Daily_Leetcodde.java.Medium;

import java.util.*;

public class Distinct_color_3160 {
    static int[] logic(int arr[][], int limit) {
        int ans[] = new int[arr.length];
      HashMap<Integer,Integer>mp=new HashMap<>();
      ArrayList<Integer>lt=new ArrayList<>();
      for (int i=0;i<arr.length;i++){

          if (!mp.containsKey(arr[i][0])){
              mp.put(arr[i][0],arr[i][1]);
          }
          else {
//              lt.add(arr[i][1]);
              int val=mp.get(arr[i][0]);
              mp.put(arr[i][0],arr[i][1]);
              if (lt.contains(val)){
                  int x=lt.indexOf(val);
                  lt.remove(x);
              }
          }
          if (lt.contains(arr[i][1])){
              mp.remove(arr[i][0]);
          }
          lt.add(arr[i][1]);

          ans[i]=mp.size();

      }
        return ans;
    }
    public static void main(String[] args) {
//        Input: limit = 4, queries = [[1,4],[2,5],[1,3],[3,4]]
//
//        Output: [1,2,2,3]
        int arr[][]={{0,1},{1,2},{2,2},{3,4},{4,5}};
        int limit=4;
        System.out.println( Arrays.toString(logic(arr,limit)));

    }
}
