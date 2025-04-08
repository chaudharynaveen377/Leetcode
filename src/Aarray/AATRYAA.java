package Aarray;
import java.util.Stack;

public class AATRYAA {
    static class node{
        int data;
        node next;
        node(){}
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
//        node a=new node(1);
//        node b=new node(2);
//        node c=new node(3);
//        node d=new node(-3);
//        node e=new node(-4);
//        node ans=new node(4);
//        node temp=ans;
//
//        a.next=b;b.next=c;c.next=d;d.next=e;
//        node head=a;
//        Stack<Integer> sc=new Stack<>();
//        while(head!=null) {
//             if(sc.size()>0){
//               if ( sc.peek()+head.data!=0){
//                   sc.push(head.data);
//                   head=head.next;
//                    }
//               else {
//                   sc.pop();
//                   head=head.next;
//                   }
//             }
//             else {sc.push(head.data);
//                   head=head.next;
//             }
//        }
//        System.out.println(sc);
//        Stack<Integer>qu=new Stack<>();
//        while(sc.size()!=0){
//            qu.add(sc.pop());
//        }
//        while(qu.size()!=0){
//            ans.next=new node(qu.pop());
////           ans.next=ans;
//           ans=ans.next;
//        }
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//        int x=0;
//        int x1=(x>=0&&x==0)?x=4:2;
//        System.out.println(x1);
        int numBottles=9;
        int numExchange=3;
        int x=numBottles;
        int ans=numBottles;
        int y=0;
        while(x>=1 && x/numExchange!=0){
            y=x%numExchange;
            x=x/numExchange;
            ans=ans+x;
            x=x+y;
        }
        System.out.println(ans);
        System.out.println(true && false);
    }
}