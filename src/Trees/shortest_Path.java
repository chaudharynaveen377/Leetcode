package Trees;

public class shortest_Path {
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
    static int shortPath(node root,int lt,int rt){
        if (root==null){
            return 0;
        }
        if (root.data==lt){
            return 1;
        }
        int lft=shortPath(root.left,lt,rt);
        int rgt=shortPath(root.right,lt,rt);
        if (root.data==rt){
            return lft+rgt;
        }
        return lft+rgt+1;
    }
    public static void main(String[] args) {
        node a=new node(1);
        a.left=new node(2);
        a.right=new node(3);
        a.left.left=new node(4);
        a.left.right=new node(5);
        a.right.left=new node(6);
        a.right.right=new node(7);
        node root=a;

//        1
//      /   \
//     2      3
//    / \    /  \
//   4   5  6    7
        System.out.println(shortPath(root,4,3));

    }
}
