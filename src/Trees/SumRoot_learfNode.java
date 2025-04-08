package Trees;

public class SumRoot_learfNode {
    static class node {
                int data;
        node right;
        node left;
        node(){
        }
        node(int data){
            this.data=data;
        }
    }
    static int ans1=0;
    static int sumLeaf(node root,int ans){
        if (root==null){
            return ans;
        }
        ans=ans*10+root.data;
        if (root.left==null && root.right==null){
            ans1=ans1+ans;
        }
        sumLeaf(root.left,ans);
        sumLeaf(root.right,ans);
        return ans;
    }
    public static void main(String[] args) {
        node a=new node(4);
        a.left=new node(9);
        a.right=new node(0);
        a.left.left=new node(5);
//        a.left.right=new node(1);
//        a.right.left=new node(4);
//        a.right.right=new node(4);
        node root=a;
        System.out.println(sumLeaf(root,0));
        System.out.println(ans1);
    }
}
