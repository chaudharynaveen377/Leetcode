package Trees;
import java.util.*;
public class KthLevel {
    static class node{
        int data;
        node left;
        node right;
        node(){}
        node(int data){
            this.data=data;
        }
    }
    static boolean check_leaf_node(node root,int target){
        if (root==null){
            return false;
        }
        if (root.data==target && root.left==null && root.right==null){
            return true;
        }
      boolean left=  check_leaf_node(root.left,target) ;
      boolean right= check_leaf_node(root.right,target);

         return left || right;
    }
//static  node root1=
    static node remove_leafnode(node root,int target,int count){
        if (root==null){
            return null;
        }

      node newnode=new node(root.data);
      newnode.left= remove_leafnode(root.left,target,count+1);
      newnode.right=  remove_leafnode(root.right,target,count+1);
        if (root.data==target && root.right==null  && root.left==null ){
            return null;
        }
        return newnode;
    }
    static ArrayList<Integer> lt=new ArrayList<>();
    static void KthMin(node root){
        if (root==null){
            return;
        }
        lt.add(root.data);
        KthMin(root.left);
        KthMin(root.right);
    }
    static void levelOrder(node root){
        if (root==null){
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            node currnode =q.remove();
            if (currnode==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else{q.add(null);
                }
            }
            else{
                System.out.print(currnode.data+" ");
                if (currnode.left!=null){
                    q.add(currnode.left);
                }
                if (currnode.right!=null){
                    q.add(currnode.right);
                }
            }
        }
    }
    static void kth(node root,int n,int level){
        if (root==null){
            return;
        }
        if (level==n){
            System.out.print("NTH LEVEL "+root.data+" ");
        }
        kth(root.left,n,level+1);
        kth(root.right,n,level+1);
    }
    public static void main(String[] args) {
        node a=new node(1);
        a.left=new node(3);
        a.right=new node(3);
        a.left.left=new node(3);
        a.left.right=new node(2);
        a.right.left=new node(4);
        a.right.right=new node(4);
        node root=a;

       node root1= remove_leafnode(root,3,0);
        levelOrder(root1);
//        kth(root,2,1);
//        System.out.println(check_leaf_node(root,2));
    }
}
