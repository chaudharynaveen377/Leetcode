package PriorityQueue.CodewithMike;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_Fq_347 {
    static int[] topK_freq(int arr[],int k){
        int ans[]=new int[k];
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(countMap.entrySet());
       for (int i=0;i<k;i++){
           ans[i]=pq.poll().getKey();
       }
       return ans;
    }
    static void disp(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,3,4,4,4};
        int k=2;
       disp(topK_freq(arr,2));

    }
}
