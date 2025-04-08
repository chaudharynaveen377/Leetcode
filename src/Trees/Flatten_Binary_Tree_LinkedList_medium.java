package Trees;

public class Flatten_Binary_Tree_LinkedList_medium {
    static class node{
        int data;
        node next;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.next=null;
            this.left=null;
            this.right=null;
        }
    }
    static void makeLL(node root,node root1){
        if (root==null){
            return ;
        }
        node newroot=new node(root.data);
        root1.next=newroot;
        makeLL(root.left,root1.next);
        makeLL(root.right,root1.next);


    }
    public static void main(String[] args) {
        node a=new node(1);
        a.left=new node(2);
        a.right=new node(5);
        a.left.left=new node(3);
        a.left.right=new  node(4);
        a.right.right=new  node(6);
        node root=a;
        makeLL(a,a);
        while (root!=null){
            System.out.println(root.data);
            root=root.next;
        }

    }
}
