package LinkList.Deletion;

public class Delete_End {
    static class node{
                                int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static void display(node root){
        while (root!=null){
            System.out.println(root.data);
            root=root.next;
        }
    }
    static node delete_Last(node root){
        if (root==null || root.next==null ){
            return root;
        }
        node temp=root;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return root;
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        display(delete_Last(null));
    }
}
