package LinkList.Insertions;

import java.util.LinkedList;

public class Insert_At_Start {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static node insert_start(node root,int start){
        if (root==null){
            return  root;
        }
        node newnode=new node(start);
        newnode.next=root;
        return newnode;
    }
    static void display(node root){
        while (root!=null){
            System.out.println(root.data);
            root=root.next;
        }
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        a.next=b;b.next=c;c.next=d;
        display(insert_start(a,6));
        LinkedList<Integer> ll=new LinkedList<>();
    }
}
