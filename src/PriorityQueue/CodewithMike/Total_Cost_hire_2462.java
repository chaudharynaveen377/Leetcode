package PriorityQueue.CodewithMike;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Total_Cost_hire_2462 {
    public static void main(String[] args) {
        int []costs={31,25,72,79,74,65,84,91,18,59,27,9,81,33,17,58};
        int k=11;
        int candidates=2;
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->a-b);
        PriorityQueue<Integer>pq1=new PriorityQueue<>((a,b)->a-b);
        int i=0,j= costs.length-1;
        int lm=0;
        int rm=0;
        int ans=0;
        for ( int l=0;l<k;l++) {
           while (pq.size()<candidates && i< costs.length){
               pq.add(costs[i]);i++;
           }
           while (pq1.size()<candidates && j>=0){
               pq.add(costs[j]);j--;
           }
           lm=pq.peek();
           rm=pq1.peek();
           if (lm<=rm){
               ans=ans+pq.poll();
               if (i< costs.length){
                   pq.add(costs[i]);
               }
               else {
//                   ans=ans+
               }
           }
        }
        System.out.println(ans);
//
    }
}
