package LinkList;

public class RemoveNthNodefromEnd {
    static class node{
        int data;
        node next;
        node(){

        }
        node(int data){
            this.data=data;
        }
    }
static node remove(node head,int n){
        int size=0;
        node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        if (n==size){
            return head.next;
        }
        int k=size-n;
        int i=1;
        temp=head;
        while(i!=k){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;

        return head;
}
    public static void main(String[] args) {
//        first create node class for linkList
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        a.next=b;b.next=c;c.next=d;d.next=e;

        node head=a;
     node x=   remove(head,5);
        while (x!=null){
            System.out.println(x.data);
            x=x.next;
        }
    }
}
