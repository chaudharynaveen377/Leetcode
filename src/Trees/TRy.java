package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TRy {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left= null;
            this.right= null;
        }
    }
    static void levelOrder(node root){
        if (root==null){
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            node currnode =q.remove();
            if (currnode==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else{q.add(null);
                }
            }
            else{
                System.out.print(currnode.data+" ");
                if (currnode.left!=null){
                    q.add(currnode.left);
                }
                if (currnode.right!=null){
                    q.add(currnode.right);
                }
            }
        }
    }
    static class binaryTree{
      static   int idx = -1;
  static node getnode(int[] nodes) {
       idx++;
       if (nodes[idx] == -1) {
           return null;
       }
       node newnode = new node(nodes[idx]);
       newnode.left = getnode(nodes);
       newnode.right = getnode(nodes);
       return newnode;
   }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        node x=binaryTree.getnode(nodes);
        levelOrder(x);
        System.out.println(x.data);

    }
}
