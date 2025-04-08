package Trees.Code_Story;

import java.util.ArrayList;
import java.util.Arrays;

public class Path_Sum_2 {
    static class node{
            int data;
    node left;
    node right;
    node(){

    }
    node(int data){
        this.data=data;
    }
}
static ArrayList<Integer> lt=new ArrayList<>();
static ArrayList<ArrayList<Integer>> lt1=new ArrayList<>();
static node pathsum(node root,int target){
        if (root==null){
            return null;
        }
        lt.add(root.data);
        target=target-root.data;
        if (root.left==null && root.right==null){
            if (target==0){
            lt1.add(new ArrayList<>(lt));
                }

        }
        pathsum(root.left,target);
        pathsum(root.right,target);
    lt.removeLast();
    return null;
}
    public static void main(String[] args) {
        node a=new node(1);
      a.left=new node(2);
      a.right=new node(3);
      a.left.left=new node(4);  a.left.right=new node(5); a.right.left=new node(3);a.right.right=new node(7);
      pathsum(a,7);
        System.out.println(lt1);
    }
}
