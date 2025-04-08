package Trees;

public class Depth_tree {
    static class node {
                int data;
        node right;
        node left;
        node(){
        }
        node(int data){
            this.data=data;
        }
    }
    static int max_depth(node root){
        if (root==null){
            return 0;
        }
        int left=max_depth(root.left);
        int right=max_depth(root.right);
        return Math.max(left,right)+1;
    }
    public static void main(String[] args) {
        node a=new node(4);
        node b=new node(8);
        node c=new node(5);
        node d=new node(0);
        node e=new node(1);
        node f=new node(6);

        a.right=c;a.left=b;
        b.left=d;b.right=e;
        c.right=f;
        node root=a;
        System.out.println(max_depth(root));
    }
}
