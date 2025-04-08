package LinkList.Approaches;

public class SortLL {
    static  class node{
        int data;
        node next;
        node(){
        }
        node(int data){
            this.data=data;
        }
    }
    static void swap(node head){
    }
    public static void main(String[] args) {
        node a=new node(5);
        node b=new node(4);
        node c=new node(3);
        node d=new node(2);
        node e=new node(1);
        a.next=b;b.next=c;c.next=d;d.next=e;
        while(a!=null){
            System.out.println(a.data);
            a=a.next;
        }
    }
}
