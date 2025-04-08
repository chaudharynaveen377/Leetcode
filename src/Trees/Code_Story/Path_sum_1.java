package Trees.Code_Story;

public class Path_sum_1 {
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
static boolean Path_sum(node root,int target){
        if (root==null){
            return false;
        }
        target=target-root.data;
        if (root.left==null && root.right==null && target==0){
            return true;
        }
        return Path_sum(root.left,target) || Path_sum(root.right,target);
}
    public static void main(String[] args) {
        node a=new node(1);
      a.left=new node(2);
      a.right=new node(3);
      a.left.left=new node(4);  a.left.right=new node(5); a.right.left=new node(3);a.right.right=new node(7);
        System.out.println(Path_sum(a,7));
    }
}
