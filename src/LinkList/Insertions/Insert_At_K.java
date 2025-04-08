package LinkList.Insertions;

public class Insert_At_K {
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
    static node Insert_k(node root,int val,int k){
        node newnode=new node(val);
        node temp=root;
        if (k==0){
            newnode.next=root;
            return newnode;
        }
        if (k>size(temp) || k<=0){
            System.out.println("Index out of bound");
            return root;
        }
        for (int i=0;i<k-1;i++){
            temp=temp.next;
        }
        node temp1=temp.next;
        temp.next=newnode;
        newnode.next=temp1;
        return root;
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        a.next=b;b.next=c;c.next=d;
        display(Insert_k(a,6,0));
    }
}
