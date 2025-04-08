package Recursion;
public class LinkLst {
    static class node{
        int data;
        node next;
        node(){
        }
        node(int data){
         this.data=data;
        }
    }
    static void ll(node head,int []arr,int i){
        if (head==null|| i==arr.length){
            return;
        }
        head.data=arr[i];
     ll(head.next,arr,i+1);


    }
    public static void main(String[] args) {
      node a=new node(1);
      node b=new node(2);
      node c=new node(3);
      node d=new node(4);
      node e=new node(5);
      a.next=b;b.next=c;c.next=d;d.next=e;
      int arr[]={2,4,6,89};
      node head=a;
      node head1=a;
      ll(head1,arr,0);
      while (head!=null){
          System.out.println(head.data);
          head=head.next;
      }
    }
}
