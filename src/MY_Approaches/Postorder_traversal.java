package MY_Approaches;

import java.util.ArrayList;
import java.util.List;

public class Postorder_traversal {
    static class node{
        int data;
        node left;
        node right;
        node(){

        }
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static List<Integer> lt=new ArrayList<>();
    static void postorder(node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        lt.add(root.data);

    }
    public static void main(String[] args) {
        node a=new node(4);
        a.left=new node(9);
        a.right=new node(0);
        a.left.left=new node(5);
        postorder(a);
        System.out.println(lt);
        System.out.println(2^3);
        int x;
        int y=3;
        int z=1;
        x=y=z;// from r to l
        System.out.println(x);
        System.out.println("helo "+1+2);


    }
}
