package LinkList;

public class Implementation {
    static class node{
        int data;
        node next;
        node(){

        }
        node(int data){
            this.data=data;
        }
    }
    static int findidx(node head,int key){
        if (head==null){
            return -1;
        };
        if (head.data==key){
            return 0;
        }
        int idx=findidx(head.next,key);
        if (idx==-1){
            return -1;
        }
        return idx+1;
    }
    static boolean search(node head,int key){
       if (head==null){
           return false;
       }
       while (head!=null){
           if (head.data==key){
               return true;
           }
           head=head.next;
       }
       return false;
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        a.next=b;b.next=c;c.next=d;d.next=e;
        node head=a;
        System.out.println(findidx(head,6));
        System.out.println(search(a,3));

    }
}
