package LinkList.Code_mike;

import java.util.HashMap;

public class PartitionList_86 {
    static class node{
        int data;
    node next;
    node(int data){this.data=data;}
    node(){}
}
    static void disp(node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
}
static HashMap<node,Boolean> mp=new HashMap<>();
static node combine(HashMap<node,Boolean> mp,node head){
        node less=new node(-1);
        node newnode=less;
        node more=new node(-1);
        node newnode1=more;
        while (head!=null){
            if (mp.get(head)){
                less.next=head;
                less=less.next;
            }else {
                more.next=head;
                more=more.next;
            }
            head=head.next;
        }
        more.next=null;
        less.next=newnode1.next;
        return newnode.next;
}

    static void add_to_map(node head,int target){
        while (head!=null){
            if (head.data<target){
                mp.put(head,true);
            }
            else {
                mp.put(head,false);
            }
            head=head.next;
        }
    }
    public static void main(String[] args) {
        node a = new node(2);
            a.next = new node(1);
            a.next.next = new node(3);
            a.next.next.next = new node(2);
            a.next.next.next.next = new node(5);
            a.next.next.next.next.next = new node(2);
         add_to_map(a,2);
        disp(combine(mp,a));
//            create a hashmap that store node and boolean


    }
}
