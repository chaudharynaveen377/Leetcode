package PriorityQueue;

import java.util.*;

public class Implementation {
    public static void main(String[] args) {
//        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer>pq=new PriorityQueue<>();

//        ascending order priority usig binary tree traversal

        pq.offer(1);
        pq.offer(0);
        pq.offer(3);
        pq.offer(4);
        pq.offer(0);
//        Collections.sort(pq);
        List<Integer> sortedList = new ArrayList<>(pq);
        Collections.sort(sortedList);
        System.out.println(pq);
        System.out.println(sortedList);
    }
}
