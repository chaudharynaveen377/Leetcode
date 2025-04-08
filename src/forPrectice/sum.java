package forPrectice;


import java.util.LinkedList;
import java.util.Queue;

public class sum {
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
    static class node{
        int data;

        node left;
        node right;
        node(int data){
            this.data=data;
        }
        node(){

        }
    }
    static int sum(node root){
        if (root==null){
            return 0;
        }
        int lh=sum(root.left);
        int rh=sum(root.right);
        return lh+rh+root.data;
    }
    static node subst(node root ,int target){
        if (root == null) {
            return null;
        }


        if (root.data == target) {
            return root;
        }
        if (target < root.data) {
            return subst(root.left, target);
        } else {
            return subst(root.right, target);
        }


    }
    public static void main(String[] args) {
        node a=new node(2);
        node b=new node(1);
        a.left=b;
        node c=new node(3);
        a.right=c;
        node d=new node(0);
        c.left=d;
        node e=new node(1);
        c.right=e;
//        System.out.println(sum(a));
//         2
//       /    \
//      1      3
//     /     /   \
//          0      1
        System.out.println(subst(a,3).data);
//        levelOrder(a);
    }
}
