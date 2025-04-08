package Trees;

public class Nodeseq_avg {
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
    public static int node_avg(node root,int height){
        if (root==null){
            return 0;
        }
        if (root.data==5){

        }
        int lf=node_avg(root.left,height-1);
        int rh=node_avg(root.right,height-1);
        return (lf+rh+root.data)/height;

    }
    public static void main(String[] args) {
        node a=new node(4);
       node b=new node(8);
        node c=new node(5);
        node d=new node(0);
        node e=new node(1);
        node f=new node(6);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.right=f;
        node root=a;
    }
}
