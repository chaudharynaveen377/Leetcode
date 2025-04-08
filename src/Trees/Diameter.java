package Trees;
public class Diameter {
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
    private static int height(node root) {
        if (root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter (node root){  // 0(n^2)
        if (root ==null){
            return 0;
        }
        int leftDiam=diameter(root.left);
        int rightDiam=diameter(root.right);
        int rh=height(root.right);
        int lh=height(root.left);
        int selfdiam=lh+rh+1;
        return Math.max(selfdiam,Math.max(leftDiam,rightDiam));
    }



    public static void main(String[] args) {
        node a=new node(1);
       node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
       node f=new node(6);
       node g=new node(7);
        a.left=b;b.left=d;b.right=e;a.right=c;c.right=f;d.left=g;
        node root=a;
        System.out.println("DIAMETER =="+diameter(root)+" HEIGHT== "+height(root));

    }
}
//        1
//      /   \
//     2      3
//    /  \     \
//   4    5      6
//       /
//      7
