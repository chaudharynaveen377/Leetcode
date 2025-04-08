package LinkList.Deletion;

public class Delete_Kth {
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
    static int size(node root){
        int i=0;
        while (root!=null){
            root=root.next;
            i++;
        }
        return i;
    }
    static node delete_kth(node root,int idx){
        if (root==null){
            return null;}
        node temp=root;
        if (idx==0){
            temp=temp.next;
            root.next=null;
            return temp;}
        if (idx<0 || idx>size(temp)){
            System.out.println("Index out of bound");
            return root;}
        for (int i=0;i<idx-1;i++){
            temp=temp.next;}
        temp.next=temp.next.next;
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
        display(delete_kth(a,2));
    }
}
