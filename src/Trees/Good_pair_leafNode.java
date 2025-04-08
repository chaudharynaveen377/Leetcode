package Trees;

import java.util.ArrayList;

public class Good_pair_leafNode {


    static class node{
        int data;
        node left;
        node right;
        node(int data){this.data=data;}
    }
    static ArrayList<node> lt=new ArrayList<>();
    static void check_leaf(node root){
        if (root==null){
            return;
        }
        if (root.left==null && root.right==null){
            lt.add(root);
        }
        check_leaf(root.left);
        check_leaf(root.right);
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
    static node ancestr1(node root, node n1, node n2){
        if (root==null || root==n1||root==n2){
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
    static int dist(node root,node comman){
        if (root==null){
            return -1;
        }

        if (root==comman){
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
    static int distance(node root,node node1,node node2){
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
        check_leaf(root);
        int ans=0;
        for (int i=0;i<lt.size();i++){
            for (int j=i+1;j< lt.size();j++){

                int dist1= distance(root,lt.get(i),lt.get(j));
                if (dist1<=3){
                    ans=Math.max(ans,ans+1);
                }
            }
        }


        System.out.println(ans);
//
    }
}
