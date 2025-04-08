package Trees;

public class Smof_evenval_grandparent {
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

    static int even_gp(node root){
        if (root==null){
            return 0;
        }
        int sum=0;
        if (root.data%2==0){
            sum=grandparent(root,0);
        }
        int lt=even_gp(root.left);
        int rt=even_gp(root.right);
        return sum+lt+rt;
    }
    static int grandparent(node root,int count){
        if (root==null){
            return 0;
        }
        if (count==2){
            return root.data;
        }
        int lt=grandparent(root.left,count+1);
        int rt=grandparent(root.right,count+1);
        return lt+rt;
    }
    public static void main(String[] args) {
        node a=new node(6);
       node b=new node(7);
        node c=new node(8);
        node d=new node(2);
        node e=new node(7);
       node f=new node(1);
       node g=new node(3);
       node h=new node(9);
       node i=new node(1);
       node j=new node(4);
       node k=new node(5);

        a.right=c;a.left=b;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        d.left=h;d.right=null;
        e.left=i;e.right=j;
        g.right=k;
        node root=a;
        System.out.println(grandparent(root,0));
        System.out.println(even_gp(root));

    }
}
