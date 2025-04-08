package forPrectice;

public class PostOrder {
    public static int height(node root){
        if (root==null){
            return 0;
        }
        int h1=height(root.left);
        int h2=height(root.right);
//        return Math.max(h1,h2)+1;
        return h1+h2+1;

    }
//    static int diameter(node root){
//
//
//    }

    public static void postorder(node root){
        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data +" ");
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
        postorder(root);
        System.out.println(" height "+height(root));
    }
}
