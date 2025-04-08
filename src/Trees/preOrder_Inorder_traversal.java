package Trees;

import java.util.HashMap;

public class preOrder_Inorder_traversal {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int idx=0;
    static node combine(int []pre,HashMap<Integer,Integer>inorderMp ,int start,int end){
        if (start>end){
            return null;
        }
        int root=pre[idx++];
        node newnode=new node(root);
       int i= inorderMp.get(root);
        newnode.left=combine(pre,inorderMp,start,i-1);
        newnode.right=combine(pre,inorderMp,i+1,end);
        return newnode;
    }
    static  void preorder(node root){
        if (root==null){
            return;
        }

        preorder(root.left);
        System.out.println(root.data);
        preorder(root.right);
    }
    public static void main(String[] args) {
//        node a = new node(3);
//        a.left = new node(3);
//        a.left.left = new node(1);
//        a.left.right = new node(1);
//        a.right = new node(2);
//        a.right.left = new node(1);
//        a.right.right = new node(0);
//        node root = a;
//
//        preorder(root);

        int[] pre = {3, 9, 20, 15, 7};
        int[] Inorder = {9, 3, 15, 20, 7};
        HashMap<Integer, Integer> inorderMp = new HashMap<>();
        for (int i=0 ;i< Inorder.length;i++){
            inorderMp.put(Inorder[i],i);
        }
        node root=combine(pre,inorderMp,0,pre.length-1);
        preorder(root);
    }
}
