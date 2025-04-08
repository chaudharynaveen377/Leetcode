package LinkList.Medium;

public class Cycle_LL {
    static class node{
                int data;
        node next;
        node(){
        }
        node(int data){
            this.data=data;
        }
    }
    static boolean check_cycle(node head){
        node slow=head;
        node fast=slow.next;
        while (true){
            if (slow==null || fast==null){
                return false;
            }
            if (slow==fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        a.next=b;b.next=c;c.next=d;d.next=e;
        e.next=b;
        node head=a;
        System.out.println(check_cycle(head));
    }
}
