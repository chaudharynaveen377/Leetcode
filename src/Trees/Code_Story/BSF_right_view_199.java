package Trees.Code_Story;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BSF_right_view_199 {
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
static void BSF(node root){
    Queue<node> que=new LinkedList<>();
    que.add(root);
    que.add(null);
    while (!que.isEmpty()){
        node newnode=que.poll();
        if (newnode==null){
            System.out.println();
            if (!que.isEmpty()){
                que.add(null);
            }
        }
        else {
            System.out.print(" "+newnode.data);
            boolean flag=true;
            if (newnode.left!=null){
                que.add(newnode.left);

            }
            if (newnode.right!=null){
                que.add(newnode.right);

            }
        }
    }
}
static ArrayList<Integer> right_view(node root){
        ArrayList<Integer> lt=new ArrayList<>();
    Queue<node> que=new LinkedList<>();
    que.add(root);
//    que.add(null);
  int n=que.size();
  while (n--!=0){
     node newnode=que.poll();
     if (newnode!=null){
         if (newnode.left!=null){
             que.add(newnode.left);
         } if (newnode.right!=null){
             que.add(newnode.right);
         }
     }
     if (n==0){
         assert newnode != null;
         lt.add(newnode.data);
         n=que.size();
     }
  }
       return lt;
}
    public static void main(String[] args) {
        node a=new node(1);
      a.left=new node(2);
      a.right=new node(3);
      a.left.left=new node(4);  a.left.right=new node(5); a.right.left=new node(6);a.right.right=new node(7);
        System.out.println( right_view(a));
    }
}
