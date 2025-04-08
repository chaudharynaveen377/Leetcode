package MY_Approaches;

import Trees.LowestCommonAncestor;

import java.util.ArrayList;

public class Least_common_ancestor {

//    aproache one
    static node ancestr(node root,int n1,int n2){
        if (root==null || root.data==n1||root.data==n2){
            return root;
        }
        node left=ancestr(root.left,n1,n2);
        node right=ancestr(root.right,n1,n2);
        if (left==null){
            return right;
        }
        if (right==null){
            return left;
        }
        return root;
    }
    static boolean path(node root,int n, ArrayList<Integer> al){
            if (root==null){
                return false;
            }
            al.add(root.data);
            if (root.data==n){
                return true;
            }
            boolean left = path(root.left,n,al);
            boolean right= path(root.right,n,al);
            if (left||right){
                return true;
            }
            al.removeLast();
            return false;
        }
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this .left=null;
            this .right=null;
        }
    }
    public static void main(String[] args) {
        node a=new node(1);
        a.left=new node(2);
        a.left.left=new node(4);
        a.right=new node(3);
        a.right.right=new node(6);
        a.left.right=new node(5);
        a.right.left=new node(7);
//        a.right.left.left=new node(8);
        node root=a;
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        path(root,7,al1);
        path(root,6,al2);
        System.out.println(al1);
        System.out.println(al2);
        int ans=-1;
        for (int i=0;i<al1.size() && i< al2.size();i++){
            if (al1.get(i)==al2.get(i)){
                ans=al1.get(i);
            }
        }
        System.out.println(ans);

        //
//               1
//     //      /   \
//     //     2      3
//     //    /  \    / \
//     //   4    5  7   6
////

    }
}
