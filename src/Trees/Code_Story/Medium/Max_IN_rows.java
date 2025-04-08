package Trees.Code_Story.Medium;

import com.sun.source.util.Trees;

import java.util.*;

public class Max_IN_rows {
    public static class node {
        int data;
        public node right;
        public node left;
        node(){
        }
        public node(int data){
            this.data=data;
        }
    }
    static List<Integer> level_order(node root){
        Queue<node> que=new LinkedList<>();
        que.add(root);
        que.add(null);
        List<Integer>lt=new ArrayList<>();
        lt.add(root.data);

        int max=Integer.MIN_VALUE;
        while (!que.isEmpty()){
            node newnode=que.poll();
            if (newnode==null){
                if (que.isEmpty())break;
                else {
                    lt.add(max);
                    max=Integer.MIN_VALUE;
                    que.add(null);
                }
            }
            else {
                if (newnode.left!=null){
                    que.add(newnode.left);
                   max=Math.max(max,newnode.left.data);
                }
              if (newnode.right!=null){
                  que.add(newnode.right);
                  max=Math.max(max,newnode.left.data);

              }

            }
        }
        return lt;
    }

        public static void main(String[] args) {
            node a=new node(1);
        a.left=new node(4);
        a.right=new node(3);
        a.left.left=new node(7);
        a.left.right=new  node(6);
        a.right.left=new  node(1);
        a.right.right=new  node(5);
        a.right.left.left=new  node(9);
        a.right.right.left=new  node(10);
        node root=a;
            System.out.println(level_order(root));
    }
}
