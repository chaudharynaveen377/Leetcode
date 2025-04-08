package Trees;

import MY_Approaches.Least_common_ancestor;

import java.util.ArrayList;

public class LowestCommonAncestor {
    static class node{
        int data;
        node left;
        node right;
        node(int data){this.data=data;}
    }
    static boolean getpath(node root, int want, ArrayList<Integer> al){
        if (root==null){
            return false;
        }
        al.add(root.data);
        if (root.data==want){
            return true;
        }
       boolean left = getpath(root.left,want,al);
       boolean right= getpath(root.right,want,al);
        if (left||right){
            return true;
        }
        al.removeLast();
        return false;
    }
    static node ancestr1(node root, int n1, int n2){
        if (root==null || root.data==n1||root.data==n2){
            return root;
        }
        node left=ancestr1(root.left,n1,n2);
        node right=ancestr1(root.right,n1,n2);
        if (left==null){
            return right;
        }
        if (right==null){
            return left;
        }
        return root;
    }
    static int dist(node root,int comman){
        if (root==null){
            return -1;
        }

        if (root.data==comman){
            return 0;
        }
      int lft=  dist(root.left,comman);
        int rgt = dist(root.right, comman);
        if (lft == -1 && rgt == -1) {
            return -1;
        } else if (lft == -1) {
            return rgt + 1;
        } else {
            return lft + 1;
        }
    }
    static int distance(node root,int node1,int node2){
        node comman=ancestr1(root,node1,node2);
        int rgt=dist(comman,node1);
        int lft=dist(comman,node2);
         return rgt+lft;

    }
    public static void main(String[] args) {
        node a=new node(1);
        a.left=new node(2);
        a.left.left=new node(4);
        a.right=new node(3);
        a.right.right=new node(6);
        a.left.right=new node(5);
        a.right.left=new node(7);
        a.right.left.left=new node(8);
        node root=a;
        System.out.println("LOWEST ANCESTOR IS --> "+ancestr1(root,6,6).data);
        System.out.println(dist(root,7));
        System.out.println(distance(root,4,6));
//
//               1
//     //      /   \
//     //     2      3
//     //    /  \    / \
//     //   4    5  7   6
////

    }
}
