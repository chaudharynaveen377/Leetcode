package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {
    static class node{
        node left;
        node right;
        int data;
        node(int data){
            this.data=data;
        }
        node(){

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
    static boolean aBoolean(node root){
        if (root.left==null && root.right==null){
            if (root.data==0)return false;
            return true;
        }
       boolean left=aBoolean(root.left);
       boolean right=aBoolean(root.right);
       if (root.data==2){
           return left||right;
       }
       return left && right;

    }
    static node GST(node root){
        if (root==null){
            return null;
        }
        node newnode=new node(root.data);
        newnode.right=GST(root.right);
        newnode.left=GST(root.left);
        if (root.right!=null){

}
        return newnode;

    }
    static  int s2ndmin(node root){
        if (root==null){
            return 0;
        }
        node newroot=new node(root.data);
        int left=s2ndmin(root.left);
        int right=s2ndmin(root.right);
        return Math.min(Math.min(left,right),newroot.data);
    }
    static void mirror(node root){

        if (root==null){
            return ;
        }
        node temp = root.left;
        root.left = root.right;
        root.right = temp;
         mirror(root.left);
         mirror(root.right);

    }
    public static void main(String[] args) {
        node a=new node(3);
        a.left=new node(3);
        a.left.left=new node(1);
        a.left.right=new node(1);
        a.right=new node(2);
        a.right.left=new node(1);
        a.right.right=new node(0);
        node root=a;
//        node newroot=new node(1);
//        levelOrder(root);
//        mirror(root);
        System.out.println(  aBoolean(root));
        System.out.println(s2ndmin(root));
//        levelOrder(newroot);
//        1
//      /   \
//     2     3
//    /\    /\
//   4  5  6  7
    }
}
