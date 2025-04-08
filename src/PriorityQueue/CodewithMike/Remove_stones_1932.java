package PriorityQueue.CodewithMike;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Remove_stones_1932 {
    static int output(int arr[],int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        pq.addAll(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        int ans=0;
        for (int i=0;i<k;i++){
            int key=(pq.poll()+1)/2;
            pq.add(key);
        }
        for (int i:pq){
            ans=ans+i;
        }
        return ans;
    }
    public static void main(String[] args) {
//        Input: piles = [5,4,9], k = 2
//        Output: 12
        int arr[]={5,4,9};
        int k=2;
        System.out.println(output(arr,k));
    }
}
