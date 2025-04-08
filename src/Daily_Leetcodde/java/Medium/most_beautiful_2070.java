package Daily_Leetcodde.java.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class most_beautiful_2070 {
    static void timeExceed(){
        int [][] items = {{1,2},{3,2},{2,4},{5,6},{3,5}};
        int [] queries = {1,2,3,4,5,6};
        int max=0;
        for (int i=0;i<items.length;i++){
            for (int j=0;j< items.length;j++){
                if (items[j][0]<=queries[i] && items[j][1]>max){
                    max=Math.max(max,items[j][1]);
                }
            }
            queries[i]=max;
        }
        for (int i = 0; i < queries.length; i++) {
            System.out.println(queries[i]);
        }
    }
    public static void main(String[] args) {
//        Input: items = [[1,2],[3,2],[2,4],[5,6],[3,5]], queries = [1,2,3,4,5,6]
//        Output: [2,4,5,5,6,6]
        int [][] items = {{1,2},{3,2},{2,4},{5,6},{3,5}};
        Arrays.sort(items, (a, b) -> {if (a[0] != b[0]) {return Integer.compare(a[0], b[0]);} else {return Integer.compare(a[1], b[1]);}});
      int [] queries={1,2,3,4,5,6};
      int max=-1;
     for (int i=0;i< items.length;i++){
         max=Math.max(max,items[i][1]);
         items[i][1]=max;
     }
     for (int i=0;i< queries.length;i++){
         int queryPrice=queries[i];
         queries[i]=custombinarySearch(items,queryPrice);
     }
        for (int query : queries) {
            System.out.println(query);
        }
    }

    private static int custombinarySearch(int[][] items, int queryPrice) {
        int l= 0;
        int r= items.length-1;
        int mid=0;
        int maxBeauty=0;
        while (l<=r){
            mid=l+(r-l)/2;
            if (items[mid][0]>queryPrice){
                r=mid-1;
            }
            else {
                maxBeauty=Math.max(maxBeauty,items[mid][1]);
                l=mid+1;
            }
        }
        return maxBeauty;
    }
}
