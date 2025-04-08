package LinkList.Code_mike;

import java.util.HashMap;

public class remove_zero_sumConsecutive_1171 {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
        node(){
        }
    }
  static HashMap<Integer,node> mp=new HashMap<>();
    static node prifix(node head){
        node newhead=head;
        int x=0;
        int i=0;
        while (head!=null){
            x=x+head.data;
            if(head.data==1001){
                x=0;
            }
            if (!mp.containsKey(x)){
                mp.put(x,head);
                head=head.next;
            }
            else {
                node b=head;
               node a= mp.get(x);
               a.next=b.next;
               head=newhead;
               mp=new HashMap<>();
            }
        }
        if (newhead.next==null){
            System.out.println(true);
            return null;
        }
        return newhead;
    }
    public static void main(String[] args) {
        node a=new node(1001);
//       a.next=new node(1);
//        a.next.next=new node(-1);
//        a.next.next.next=new node(3);
//        a.next.next.next.next=new node(-3);
//        a.next.next.next.next.next=new node(-2);
//        a.next.next.next.next.next.next=new node(-1);
//        int  head[] = {1,2,-3,3,1};

        node x=a;
//[1,3,2,-3,-2,5,5,-5,1]
node head=prifix(a);
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
