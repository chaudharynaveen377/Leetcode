package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class All_in_list {
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
   static ArrayList<Integer>lt=new ArrayList<>();
    static void lts(node root){
        if (root==null){
            return ;
        }
        lt.add(root.data);
        lts(root.left);
        lts(root.right);
    }
    public static void main(String[] args) {
        node a=new node(4);
        node b=new node(8);
        node c=new node(5);
        node d=new node(0);
        node e=new node(1);
        node f=new node(6);

        a.right=c;a.left=b;
        b.left=d;b.right=e;
        c.right=f;
        node root=a;
        lts(root);
        lts(b);
        Collections.sort(lt);

        System.out.println(lt);
        node root1=b;
    }
}
