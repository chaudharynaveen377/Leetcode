package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestSum {
    static class node {
                        int data;
        node right;
        node left;
        node(){
        }
        node(int data){
            this.data=data;
        }
    }
    private static int height(node root) {
        if (root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int deepsum(node root ,int height){
        if (root==null){
            return 0;
        }
        if(height==1){
            return root.data;
        }
        int ls=deepsum(root.left, height-1);
        int rs=deepsum(root.right, height-1);
        return ls+rs;
    }
    public static void main(String[] args) {
        node a=new node(6);
       node b=new node(7);
        node c=new node(8);
        node d=new node(2);
        node e=new node(7);
        node e1=new node(1);
        node e2=new node(4);
       node f=new node(3);
       node f1=new node(1);
       node g=new node(9);
       node h=new node(5);
        a.right=c;a.left=b;
        b.left=d;b.right=e;
        e.left=e1;e.right=e2;
        d.left=g;
        c.right=f;
        c.left=f1;
        f.right=h;
        node root=a;
        System.out.println(deepsum(root,height(root)));


    }
}
