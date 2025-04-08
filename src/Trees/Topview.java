package Trees;

import javax.swing.*;
import java.util.HashMap;

public class Topview {
    static class node{
        int data;
        node left;
        node right;
        node(){}
    node(int data){
            this.data=data;
    }
    }
    static void sub(node root,int val,HashMap<Integer,node>mp){
        if (root==null){
            return;
        }
        if (!mp.containsKey(val)){
            mp.put(val,root);
        }
        sub(root.left,val-1,mp);
        sub(root.right,val+1,mp);

    }
    public static void main(String[] args) {
        node a=new node(1);
        a.left=new node(2);
        a.left.left=new node(4);
        a.left.right=new node(5);
        a.right=new node(3);
        a.right.left=new node(6);
        a.right.right=new node(7);
        node root=a;

        HashMap<Integer,node> mp=new HashMap<>();
        sub(root,0,mp);
int min=0;
int max=0;
        for(int val:mp.keySet()){
            min=Math.min(min,val);
            max=Math.max(max,val);
        }
        for (int i=min;i<=max;i++){
            System.out.println(mp.get(i).data);
        }
    }
}
