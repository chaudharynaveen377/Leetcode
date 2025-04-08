package BST.Approaches;

public class insert {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.left=null;
            this.right=null;
            this.data=data;
        }
        node(){}
    }
    public static void disp(node root) {
        if (root == null) {
            return;
        }
        // Traverse the left subtree
        disp(root.left);
        // Visit the root node
        System.out.print(root.data + " ");
        // Traverse the right subtree
        disp(root.right);
    }
    static node insert_bst(node root,int val){
        if (root==null){
            root=new node(val);
            return root;
        }
        if (root.data>val){
            root.left=insert_bst(root.left,val);
        }
        if (root.data<val){
            root.right=insert_bst(root.right,val);
        }
        return root;
    }
    public static void main(String[] args) {
        int arr[]={5,1,3,4,2,7};
        node head=null;
for (int i=0;i<arr.length;i++){
  head=  insert_bst(head,arr[i]);
}
disp(head);
    }
}
