package Lab_Programs;

public class Lab_exp_2 {
    static class node{
        node next;
        int data;
        node(int data){
            this.next=null;
            this.data=data;
        }
        node(){}
    }
    static node insertAtStart(node root,node head){
        head.next=root;
        root=head;
        return root;
    }
    static node insertAtEnd(node root,node end){
        node head=root;
        while (root.next!=null){
            root=root.next;
        }
        root.next=end;
        return head;
    }
    static int nodeSize(node root){
        int count=0;
        while (root!=null){
            count++;
            root=root.next;
        }
        return count;
    }
    static node insertAtIdx(node root ,node indx,int idx){
        if (idx>nodeSize(root)){
            System.out.println(" idx is greater then size...( 0 based indexing)");
            return root;
        }
        if (idx==0){
            return insertAtStart(root,indx);
        }
       if (idx==nodeSize(root)){
            return insertAtEnd(root,indx);
        }
       node head=root;
       while (idx-1!=0){
           root=root.next;
           idx--;
       }
       node temp=root.next;
       root.next=indx;
       indx.next=temp;
       return head;

    }
    static void printNode(node root){
        while (root!=null){
            System.out.println(root.data);
            root=root.next;
        }
    }
    public static void main(String[] args) {
        node a=new node(3);
        node b=new node(4);
        node c=new node(5);
        node d=new node(6);
        a.next=b;b.next=c;c.next=d;
        node root=a;
        node head1=insertAtIdx(root,new node(-2),5);

        printNode(head1);


    }
}
