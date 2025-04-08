package Trees;

public class preorder_postorder_Const_bt {
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
    static int idx1=0,idx2=0;
    static node bt (int []pre,int []post,int start,int end){
        if (pre[start]==post[end])return null;
        int root=pre[idx1++];
        node newroot=new node(root);

return newroot;
    }
    public static void main(String[] args) {
        int []preorder = {1,2,4,5,3,6,7}, postorder = {4,5,2,6,7,3,1};

    }
}
