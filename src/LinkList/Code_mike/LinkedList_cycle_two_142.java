package LinkList.Code_mike;

import java.util.HashMap;
import java.util.HashSet;

public class LinkedList_cycle_two_142 {
    static class node{
        int data;
        node next;
        node(int data){this.data=data;}
        node(){}
    }
    static HashMap<node,Boolean>mp=new HashMap<>();
    static node cycle(node head){
        node fast=head;
        while (fast!=null){
            if (!mp.containsKey(fast)){
                mp.put(fast,false);
            }
            else return fast;
            fast=fast.next;
        }
        return null;
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        a.next=b;b.next=c;c.next=d;d.next=e;
        System.out.println(cycle(a));
    }
}
