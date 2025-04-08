package Recursion;

public class removeelementLL {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
        node(){
        }
    }
    static node removell(node head,int target,node temp){
        if (head==null||head.next==null){
            return temp;
        }
        if (head.next.data==target){
            head.next=head.next.next;
        }

        return removell(head.next,target,temp);
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(6);
        node d=new node(3);
        node e=new node(4);
        node f=new node(5);
        node g=new node(6);
        a.next=b;b.next=c;c.next=d;d.next=e;e.next=f;f.next=g;
        node head=a;
        node temp=a;
        removell(head,2,temp);
        while (a!=null){
            System.out.println(a.data);
            a=a.next;
        }
    }
}
