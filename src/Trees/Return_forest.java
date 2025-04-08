package Trees;

import java.util.ArrayList;
import java.util.HashSet;

public class Return_forest {
    public static ArrayList<node> lst(node root,int[]arr){
        HashSet<Integer> set=new HashSet<>();
        for(int ele:arr){
            set.add(ele);
    }
        ArrayList<node> ans=new ArrayList<>();
        helper(root, set,ans);
        if(!set.contains(root.data)) {
            ans.add(root);
        }
            return ans;
    }
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
    public static node helper(node root, HashSet<Integer> set, ArrayList<node> ans){
        if(root == null){
            return null;}
        root.left=helper(root.left, set, ans);
        root.right=helper(root.right,set,ans);
        if(set.contains(root.data)){
            if(root.left != null) {
                ans.add(root.left);
            }
                if (root.right != null) {
                    ans.add(root.right);
                }
                    return null;
                }

                return root;
            }
    public static void main(String[] args) {
        node a=new node(1);
        a.left=new node(2);
        a.right=new node(3);
        a.left.left=new node(4);
        a.left.right=new node(5);
        a.right.left=new node(6);
        a.right.right=new node(7);
        node root=a;
int arr[]={3,5};
ArrayList<node> lt=new ArrayList<>();
lt=lst(root,arr);
for (int i=0;i< lt.size();i++){
        System.out.println(lt.get(i).data);}

    }
}
