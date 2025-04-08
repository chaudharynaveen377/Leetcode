package Daily_Leetcodde.java.Easy;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Rank_transformation_1331 {
    public static void main(String[] args) {
     int[] arr = {40,40,40,30};
//        Output: [4,1,2,3]

        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for (int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int val=1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while (!pq.isEmpty()){
            if (!mp.containsKey(pq.peek())){
                mp.put(pq.peek(),val++);
            }
            pq.poll();
        }
        System.out.println(mp);
        for (int i=0;i<arr.length;i++){
            if (mp.containsKey(arr[i])){
                arr[i]=mp.get(arr[i]);
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
