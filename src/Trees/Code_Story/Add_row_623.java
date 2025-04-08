package Trees.Code_Story;

public class Add_row_623 {
    static class node {
        int data;
        node left;
        node right;
        node() {

        }
        node(int data) {
            this.data = data;
        }
    }
static node Add_row(node root,int depth,int temp,int val){
        if (root==null){
            return null;
        }
        node newnode=root;
    if (temp==depth-1){
        node temp_left=root.left;
        node temp_right=root.right;

newnode.left=new node(1);
newnode.right=new node(1);

newnode.left.left=temp_left;
newnode.right.right=temp_right;
    }
        newnode.left=Add_row(root.left,depth,temp+1,val);
        newnode.right=Add_row(root.right,depth,temp+1,val);

        return newnode;
}
static void disp(node root){
    if (root==null){
        return;
    }
    System.out.println(root.data);
    disp(root.left);
    disp(root.right);
}
    public static void main(String[] args) {
        node a = new node(1);
        a.left = new node(2);
        a.right = new node(3);
        a.left.left = new node(4);
        a.left.right = new node(5);
        a.right.left = new node(6);
        a.right.right = new node(7);
disp(Add_row(a,1,0,1));
//            1
//          /   \
//         2     3
//        / \   / \
//       4   5 6   7

    }
}