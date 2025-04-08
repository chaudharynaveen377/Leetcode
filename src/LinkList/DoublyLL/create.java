package LinkList.DoublyLL;

public class create {
    static class node{
        int data;
        node next;
        node prev;
        node(int data){
this.data=data;
        }
    }

    static node insertAtend(node head,node insert){
        node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=insert;
        insert.prev=temp;
        insert.next=null;
        return head;
    }

    static void disp(node root){
        while (root!=null){
            System.out.println(root.data);
            root=root.next;
        }
    }
    public static void main(String[] args) {
node a=new node(1);
node b=new node(2);
node c=new node(3);
node d=new node(4);
a.prev=null;a.next=b;b.prev=a;b.next=c;c.prev=b;c.next=d;d.prev=c;
d.next=null;

node x=new node(5);
disp(insertAtend(a,x));
    }
}
