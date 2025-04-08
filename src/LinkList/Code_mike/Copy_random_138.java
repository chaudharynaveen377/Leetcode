package LinkList.Code_mike;

import java.util.HashMap;

public class Copy_random_138 {
   static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    static int indx(Node head,Node a){
       Node h1=head;
        HashMap<Node ,Integer> mp=new HashMap<>();
        int i=0;
       while (h1!=null){
           mp.put(h1,i++);
           h1=h1.next;
       }
       if (mp.containsKey(a)){
           return mp.get(a);
       }
       return -1;
    }
    public static void main(String[] args) {
//        head = [[7,null],[13,0],[11,4],[10,2],[1,0]]

        Node a=new Node(7);
        Node b=new Node(13);
        Node c=new Node(11);
        Node d=new Node(10);
        Node e=new Node(1);
        a.next=b;b.next=c;c.next=d;d.next=e;e.next=null;
        a.random=null;b.random=a;c.random=e;d.random=c;e.random=a;
        System.out.println(indx(a,b.random));
//        create a function that return the index of linked random
    }
}
