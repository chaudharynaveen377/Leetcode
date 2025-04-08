package forPrectice;

public class Inorder {
    public static void inorder(node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        a.left=b;
        node c=new node(3);
        a.right=c;
        node d=new node(4);
        b.left=d;
        node e=new node(5);
        b.right=e;
        node f=new node(6);
        c.right=f;
//        node g=new node(1);
        node root=a;
        inorder(root);

    }
}
