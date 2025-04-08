package Trees;

public class Reverse_level_order_traversal {
    static node reverse_level_order(node root){
        if (root==null){
            return null;
        }
        reverse_level_order(root.left);
        reverse_level_order(root.right);
        System.out.println(root.data);
        return null;
    }
    static class node{
                int data;
        node left;
        node right;
        node(){
        }
        node(int data){
            this.data=data;
        }
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
//      2   3
//    4  5 6  7

//        output==4 5 2 6 7 3 1
        reverse_level_order(root);

    }
}
