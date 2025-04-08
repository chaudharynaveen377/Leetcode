package Lab_Programs.DSA_Class.LinkedList;

import LinkList.LL2181;

public class merge {
    static class node{
        int data;
        node next;
        node(){
        }
        node(int data){
            this.data=data;
        }
    }
    static void disp(node root){
        while (root !=null){
            System.out.println(root.data);
            root=root.next;
        }
    }
    public static node mergeTwoLists(node l1, node l2) {
        node dummy = new node(0);
        node current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        node a=new node(1);
       a.next=new node(4);
        a.next.next=new node(13);

        node b=new node(3);
        b.next=new node(5);
        b.next.next=new node(10);
        b.next.next.next=new node(15);
        b.next.next.next.next=new node(20);
        disp(mergeTwoLists(a,b));
    }
}
