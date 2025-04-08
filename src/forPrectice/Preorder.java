package forPrectice;

public class Preorder {
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
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
        preorder(root);

    }
}
