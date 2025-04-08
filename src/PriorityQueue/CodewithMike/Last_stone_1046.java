package PriorityQueue.CodewithMike;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Last_stone_1046 {
    public static void main(String[] args) {
//        Input: stones = [2,7,4,1,8,1]
//        Output: 1
       int [] stones={};
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        pq.addAll(Arrays.asList(Arrays.stream(stones).boxed().toArray(Integer[]::new)));
        int temp2=0;
        while (pq.size()>1){
            int temp1=pq.poll();
           temp2=pq.poll();
            pq.add(temp1-temp2);
        }
        System.out.println(pq.peek());

    }
}
