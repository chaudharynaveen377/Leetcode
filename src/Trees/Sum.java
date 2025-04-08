package Trees;

public class Sum {
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
    static  void display(node root){
        if (root==null){
            return;
        }
        System.out.println(root.data);
        display(root.left);
        display(root.right);

    }
    static int sum(node root){
        if (root==null){
            return 0;
        }
        int lft=sum(root.left);
        int rgt=sum(root.right);
        return lft+rgt+ root.data;
    }
    static int count(node root){
        if (root==null){
            return 0;
        }
        int left=count(root.left);
        int right=count(root.right);
        return left+right+1;
    }
    static int height(node root){
        if (root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
    static int diameter(node root){
        if (root==null) {
            return 0;
        }
        int lftdiam=diameter(root.left);
        int lftHgt=height(root.left);
        int rgtdiam=diameter(root.right);
        int rgtHgt=height(root.right);
        int selfDiam=lftHgt+rgtHgt+1;
        return Math.max(lftdiam,Math.max(selfDiam,rgtdiam));
    }


     //        1
     //      /   \
     //     2      3
     //    /  \     \
     //   4    5      6
//       /
//      7

    public static void main(String[] args) {
//        making treess nodes
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        node f=new node(6);
        node g=new node(7);
        a.left=b;b.left=d;b.right=e;a.right=c;c.right=f;d.left=g;
        node root=a;
        display(root);
        System.out.println("SUM");
        System.out.println(sum(root));
        System.out.println("COUNT");
        System.out.println(count(root));
        System.out.println("HEIGHT");
        System.out.println(height(root));
        System.out.println("DIAMETER");
        System.out.println(diameter(root));
    }
}
