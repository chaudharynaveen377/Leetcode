package LinkList;

public class DeleteMiddleElementofLL {
  static   class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
        node(){

        }
    }
    public static void main(String[] args) {
//        delete middle element of link list
node a=new node(4);
node b=new node(5);
node c=new node(6);
node d=new node(7);
node e=new node(8);
a.next=b;
b.next=c;
c.next=d;
d.next=e;
node fast=a;
node slow=a;
node head=a;
        System.out.println("after remove ");
        if (head==null ||head.next==null){
            while (head!= null) {
                System.out.println(head.data);
                head=head.next;
            }
        }
        head=a;
        while (head!= null) {
            System.out.println(head.data);
           head=head.next;
        }
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
         head=a;
        slow.next=slow.next.next;
        System.out.println("before remove ");
        while (head!= null) {
            System.out.println(head.data);
            head=head.next;
        }

    }
}
