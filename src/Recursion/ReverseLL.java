package Recursion;

public class ReverseLL {
    static class node{
        int data;
        node next;
        node(){
        }
        node(int data){
            this.data=data;
        }
    }
    static void Rl(node head,int arr[],int i){
if (head==null){
    return;
}
arr[i]= head.data;
Rl(head.next,arr,i+1);
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        a.next=b;b.next=c;c.next=d;d.next=e;
        node head=a;
int arr[]=new int[5];
Rl(head,arr,0);
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
