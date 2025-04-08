package Daily_Leetcodde.java.Medium;

import java.util.PriorityQueue;

public class Maximum_score_2530 {

    public static void main(String[] args) {
//        Input: nums = [1,10,3,3,3], k = 3
//        Output: 17
        int nums[]= {672579536,806947365,854095676,815137525};
        int k=3;
       long ans=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for (int i=0;i< nums.length;i++){
           pq.add(nums[i]);
        }
        for (int i=0;i<k;i++){
            int x=pq.poll();
            ans=ans+x;
            int ad=(int)(x/3.0);
            pq.add(ad);
        }
        System.out.println(ans);
    }
}
