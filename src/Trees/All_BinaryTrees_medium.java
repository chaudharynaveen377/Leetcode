package Trees;

import java.util.ArrayList;

public class All_BinaryTrees_medium {
   public static boolean check_leafnode(node root){
        if (root.left==null && root.right==null){
            return true;
        }
        return false;
    }
    static int min_value(node root){
        if (root==null){
            return Integer.MAX_VALUE;
        }
        int left=min_value(root.left);
        int right=min_value(root.right);
        return Math.min(left,Math.min(root.data,right));
    }
    static int dif_insestor(node root){
        if (root==null){
            return 0;
        }
        int x=Math.abs(min_value(root)- root.data);
        if (check_leafnode(root)){
            x=0;
        }
        int left=dif_insestor(root.left);
        int right=dif_insestor(root.right);
        return Math.max(left,Math.max(right,x));
    }
//
public static int maxAncestorDiff(node root) {
    return dfs(root, root.data, root.data);  // Initialize min and max with root's value
}

    public static int dfs(node root, int min, int max) {
        if (root == null) {
            return Math.abs(max - min);  // Calculate and return difference at leaf nodes
        }

        min = Math.min(min, root.data);
        max = Math.max(max, root.data);

        // Calculate and update maximum difference efficiently
        int leftDiff = dfs(root.left, min, max);
        int rightDiff = dfs(root.right, min, max);
        return Math.max(leftDiff, rightDiff);
    }

    public static class node {
                int data;
        public node right;
        public node left;
        node(){
        }
        public node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {

      node a=new node(1);
        a.left=new node(3);
        a.right=new node(2);
        a.left.left=new node(3);
        a.left.right=new  node(2);
        a.right.left=new  node(4);
        a.right.right=new  node(0);
        a.right.right.left=new  node(3);

        node root=a;
        System.out.println(maxAncestorDiff(root));
        System.out.println(dif_insestor(root));
    }
}
