package Trees;

import java.util.HashMap;

public class inOrder_preOrder_construct_BT {
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
    static int idx=0;
    static node Bt(int []postorder,HashMap<Integer,Integer>mp,int start,int end){
        if (start>end)return null;
        int root=postorder[postorder.length-1-idx++];
        int i=mp.get(root);
        node newroot=new node(root);
        newroot.right=Bt(postorder,mp,i+1,end);
        newroot.left=Bt(postorder,mp,start,i-1);
        return newroot;
    }
    static void postorder(node root){
        if (root==null)return;
        System.out.println(root.data);
        postorder(root.left);
        postorder(root.right);

    }
    public static void main(String[] args) {
        int postorder[]={9,15,7,20,3};//for geting index put in hashmap
        int []inorder={9,3,15,20,7};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i< postorder.length;i++){
            mp.put(inorder[i],i);
        }
        node root=Bt(postorder,mp,0,postorder.length-1);
        postorder(root);
    }
}
