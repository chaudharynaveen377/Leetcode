package BST.Approaches;

public class search {
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
    static node final_step(int arr[]){
        node head=null;
        for (int i=0;i<arr.length;i++){
            head=  insert_bst(head,arr[i]);
        }
        return head;
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
static boolean search(node root,int key){
        if (root==null){
            return false;
        }
        if (root.data==key){
            return true;
        }
        if (root.data>key){
            return search(root.left,key);
        }
        if (root.data<key){
            return search(root.right,key);
        }
        return false;
}
    public static void main(String[] args) {
        int arr[]={5,1,3,4,2,7};
        node root=final_step(arr);
       disp(final_step(arr));
        System.out.println(search(root,2));
    }
}
