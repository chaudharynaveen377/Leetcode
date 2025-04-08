package Trees;

public class Subtree {
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
    static void disp(node root){
        if (root==null){
            return;
        }
        System.out.println(root.data);
        disp(root.left);
        disp(root.right);
    }
static boolean isidentical(node root,node subroot){
        if (root==null && subroot==null){
            return true;
        }
       else if (root==null||subroot==null||root.data!=subroot.data){
           return false;
        }
       if (!isidentical(root.left,subroot.left)){
           return false;
       }
       if (!isidentical(root.right,subroot.right)){
           return false;
       }
       return true;
}
static boolean subtree(node root,node subroot){
        if (root==null){
            return false;
        }
        if (root.data== subroot.data){
            if (isidentical(root,subroot)){
                return true;
            }
        }
//boolean lft=subtree(root.left,subroot);
//boolean rgt=subtree(root.right,subroot);

        return subtree(root.left,subroot)||subtree(root.right,subroot);
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
        node a2=new node(2);
        a2.left=new node(4);
        a2.right=new node(5);
        node subroot=a2;
        disp(root);
        disp(subroot);
        System.out.println(subtree(root,subroot));
    }
}
