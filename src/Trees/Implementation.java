package Trees;
import java.util.*;
import static java.lang.System.*;

public class Implementation {
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
    static class BinaryTree{
        static int idx=-1;
        public static node buildTree(int nodes[]){
            idx++;
            if (nodes[idx]==-1){
                return null;
            }
            node newnode=new node(nodes[idx]);
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);
            return newnode;
        }
    }
//    PREORDER TRAVERSAL----> RECURSIVELY
    public static void preorder(node root){
        if (root==null){
            return;
        }
        out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
//    INORDER TRAVERSAL----> RECURSIVELY
    public static void inorder(node root){
        if (root==null){
            return;
        }
       inorder(root.left);
        out.print(root.data+" ");
        inorder(root.right);
    }
//    POSTORDER TRAVERSAL..--> RECURSIVELY
    public static void postorder(node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        out.print(root.data+" ");
    }
    public  static  void levelorder(node root){
        if (root==null){
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            node currnode=q.remove();
            if (currnode==null){
                out.println();
                if (q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
                else{
                out.print(currnode.data+" ");
                  if (currnode.left!=null){
                      q.add(currnode.left);
                }
                  if (currnode.right!=null){
                      q.add(currnode.right);
                  }
            }
        }
    }
//    MAXIMUM HEIGHT
    public static int height(node root){
        if (root==null){
            return 0;
        }
        int lft=height(root.left);
        int rgt=height(root.right);
        return Math.max(lft,rgt)+1;
    }
//    COUNT NODES
    public static int count(node root){
        if (root==null){
            return 0;
        }
        int lftcount=count(root.left);
        int rightcount=count(root.right);
        return lftcount+rightcount+1;
    }
    public static int sum(node root){
        if (root==null){
            return 0;
        }
        int lft=sum(root.left);
        int rght=sum(root.right);
        return lft+rght+root.data;
    }
    public static int diameter (node root){
if (root ==null){
    return 0;
}
int leftDiam=diameter(root.left);
int rightDiam=diameter(root.right);
int lh=height(root.left);
int rh=height(root.right);
int selfdiam=lh+rh+1;
return Math.max(selfdiam,Math.max(leftDiam,rightDiam));
    }
    public static void main(String[] args) {
        int nodes[]={4,2,1,-1,-1,3,-1,-1,5,-1,6,-1,-1};

//        4
//      /   \
//     2      5
//    /  \     \
//   1    3      6


        BinaryTree tree=new BinaryTree();
        node root=tree.buildTree(nodes);
        out.println("preorder");
        preorder(root);
        out.println("\ninorder");
        inorder(root);
        out.println("\n postorder");
        postorder(root);
        out.println("\n level order ");
        levelorder(root);
        out.println("MAXIMUM HEIGHT");
        out.println(height(root));
        out.println("COUNT ROOTS");
        out.println(count(root));
        out.println("SUM OF TREE");
        out.println(sum(root));
        out.println("DIAMETER");
        out.println(diameter(root));



    }
}
