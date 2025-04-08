package PriorityQueue;

import java.util.PriorityQueue;

public class Kth_Largest_Stream {
    public int k;
    public PriorityQueue<Integer> minHeap;

    public Kth_Largest_Stream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);
        for (int num : nums) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                minHeap.offer(num);
            }
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }


}

    public static void main(String[] args) {

    }
public int add(int val){
//    if (min)
    return 0;
}}
