package forPrectice;

import Trees.Diameter;
import Trees.*;

import java.util.LinkedList;
import java.util.Queue;

public class p1 {
    static class node {
        int data;
        node right;
        node left;
        node(){
        }
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
static class bt {
    static int idx = -1;

    public static node preorder(int arr[]) {
        idx++;
        if (arr[idx] == -1) {
            return null;
        }
        node newnode = new node(arr[idx]);
        newnode.right = preorder(arr);
        newnode.left = preorder(arr);
        return newnode;

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
    public static void main(String[] args) {
//        preorder traversal
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        bt tree=new bt();
        node root=tree.preorder(arr);
        System.out.println(root.right.data);
        levelOrder(root);
    }
}
