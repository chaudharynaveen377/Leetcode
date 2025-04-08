package PriorityQueue;

import java.util.PriorityQueue;

public class KthLarg {
    public static void main(String[] args) {
        int nums[]={3,2,1,5,6,4};
        int k=2;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        for(int i : nums){
            pq.offer(i);
        }

//        for(int i = 0; i < k-1; ++i){
//            System.out.println(pq.peek());
//             pq.remove();
//
//        }
        System.out.println(pq);
    }
}
