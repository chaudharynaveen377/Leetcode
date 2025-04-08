package Trees;

import com.sun.source.util.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MinElmt {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static boolean unitree(node root){
        if (root==null){
            return true;
        }
//        node newnode=new node(root.data);
        boolean left=unitree(root.left);
        boolean right=unitree(root.right);
        if (left==right)return true;
        else return false;
    }
    static node newnode=new node(Integer.MAX_VALUE);
    public static node min(node root){
        if (root==null){
            return null;
        }
        min(root.left);
         min(root.right);
        if (root.data< newnode.data){
            newnode=root;
            return root;
        }
        else return newnode;
    }
    public static void levelOrder(node root){
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
    static node increasing(node root){

return null;
    }
        public static void main(String[] args) {
            node a=new node(10);
       node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
       node f=new node(6);
       node g=new node(7);
        a.left=b;b.left=d;b.right=e;a.right=c;c.right=f;d.left=g;
        node root1=a;
//            System.out.println(min(root1).data);
//            System.out.println(increasing(root1).right.data);
//            node root2=increasing(root1);
//            levelOrder(root2);
            System.out.println(unitree(root1));

        }
    }
