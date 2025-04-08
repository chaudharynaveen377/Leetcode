package BST.Approaches.medium;

public class abs_diff {
    static class node{
        int data;
        node left;
        node right;
        node(int data){this.data=data;}
    }
    static int min=Integer.MAX_VALUE;
    static int fst=4;
    static void abs(node root,int st){
        if (root==null){
            return;
        }
        if (st==1){
            min=root.data;
        }
        else {
        min=Math.abs(Math.min(min,root.data-min));}
        abs(root.left,st-1);
        abs(root.right,st-1);

    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(4);
        node d=new node(1);
        node e=new node(3);
        a.left=b;a.right=c;b.left=d;b.right=e;
        abs(a,1);
        System.out.println(min);
    }
}
