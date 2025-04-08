package Daily_Leetcodde.java.Medium;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Kth_sum_2583 {
    static class node{
            int data;
    node left;
    node right;
    node(){

    }
    node(int data){
        this.data=data;
    }
}

static  int ans=0;
    static HashMap<Integer,Integer> mp=new HashMap<>();

static void kth(node root,int n){
        if (root==null){
            return;
        }
        if (!mp.containsKey(n)){
            mp.put(n,root.data);
        }
        else {
            mp.put(n,mp.get(n)+root.data);
        }
        kth(root.left,n+1);
        kth(root.right,n+1);
}
    public static void main(String[] args) {
        node a=new node(1);
      a.left=new node(2);
      a.right=new node(6);
      a.left.left=new node(4);  a.left.right=new node(5); a.right.left=new node(6);a.right.right=new node(7);
      a.left.left.left=new node(10);
        kth(a,0);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for (int i:mp.keySet()){
            pq.add(mp.get(i));
        }
        System.out.println(pq);
        for (int i=0;i<2;i++){
            pq.poll();
        }
        System.out.println((long) pq.peek());
        PriorityQueue<Long>pq1=new PriorityQueue<>((c,b)-> Math.toIntExact(b - c));
    }
}
