package LinkList.Insertions;

public class Insert_At_End {
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
    static node Insert_End(node root,int end){
        node newnode=new node(end);
        if (root==null){
            return newnode;
        }
        node temp=root;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return root;
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        a.next=b;b.next=c;c.next=d;
        display(Insert_End(a,5));
    }
}
