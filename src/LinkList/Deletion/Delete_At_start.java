package LinkList.Deletion;

public class Delete_At_start {
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
    static node Delete_Start(node root){
        if (root==null){
            return root;
        }
        node temp=root;
        temp=temp.next;
        root.next=null;
        return temp;
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        a.next=b;b.next=c;c.next=d;
Delete_Start(a);
display(a);
display(b);
    }
}
