package LinkList.Code_mike;

import LinkList.ReverseLL;

import java.util.ArrayList;

public class Add_Two_Numbers_2 {
    static class node{
            int data;
    node next;
    node(int data){this.data=data;}
    node(){}
}

    public static node reversell(node h1){
        node prev=null;
       node head=h1;
        node curr=new node();
        while (curr!=null){
            curr=head.next;
            head.next=prev;
            prev=head;
            head=curr;
        }
        return prev;

    }
static void disp(node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
}
static node Add_2(node h1,node h2){
        node newnode=new node(-1);
        node newnode1=newnode;
    int qt=0;
    int carry=0;
    int x=0;
        while (h1!=null || h2!=null){
            if (h1==null && h2!=null){
                x=h2.data+carry;
                 h2=h2.next;
            }
            if (h2==null && h1!=null){
                x=h1.data+carry;
                h1=h1.next;
            }
            if (h1!=null && h2!=null){
                x=h2.data+h1.data+carry;
                h2=h2.next;
                h1=h1.next;

            }


            if (x>9){
                qt= x%10;

                newnode.next=new node(qt);

            }else {
                newnode.next=new node(x);
            }
            carry=x/10;
newnode=newnode.next;
        }
        if (carry!=0){
            newnode.next=new node(carry);
        }
        return reversell(newnode1.next);
}
    public static void main(String[] args) {
        node a = new node(7);
            a.next = new node(7);
            a.next.next = new node(7);
            a.next.next.next = new node(3);
            a.next.next.next.next = new node(5);
            node b=new node(5);
            b.next=new node(6);
            b.next.next=new node(4);
            disp(Add_2(reversell(a),reversell(b)));


    }
}
