package Trees.Code_Story;

public class Binary_tree_pruning_814 {
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
    static boolean check(node root){
        if (root==null){
            return false;
        }
        if (root.data==1){
            return true;
        }
        boolean left=check(root.left);
        boolean right=check(root.right);
         return left || right;
        }

    static void disp(node root){
        if (root==null){
            return;
        }
        System.out.println(root.data);
        disp(root.left);
        disp(root.right);
    }
    static node pruning(node root){
        if (root==null){
            return null;
        }
        if ( root.data==0 && !check(root) ){
            return null;
        }

     root.left=   pruning(root.left);
        root.right=pruning(root.right);

   return root;
    }
    public static void main(String[] args) {
        node a=new node(1);
       a.right=new node(0);
       a.right.left=new node(0); a.right.right=new node(1);

//       step 1:
//        check left and right not equal to 1
//        if no return null
//        simple DSF
        disp(pruning(a));
        System.out.println(check(a.right.left));
    }
}
