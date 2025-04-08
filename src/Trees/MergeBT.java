package Trees;

//import static Trees.levelOrderTraversal.levelOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MergeBT {
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
   static ArrayList<Integer> lt=new ArrayList<>();

    static void list(node root){
        if (root==null){
//            lt.add(-1);
            return;
        }
        lt.add(root.data);
        list(root.left);
        list(root.right);

    }

    static node tree(ArrayList<Integer> lt){

        int idx=0;
        node ans1=new node(0);
        node ans2=ans1;
        while (!lt.isEmpty()){
            node ans=new node(lt.get(idx));
            ans1.right=ans;
            ans1=ans1.right;
            lt.remove(idx);

        }
        return ans2.right;
    }
    static node merge(node root1,node root2){
        if (root1==null && root2==null){return null;
        }
        if (root1==null)return root2;
        if (root2==null)return root1;
        node newnode=new node(root1.data+root2.data);
        newnode.left=merge(root1.left,root2.left);
        newnode.right=merge(root1.right,root2.right);
        return newnode;
    }
    public static void main(String[] args) {
        node a=new node(1);
       node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
       node f=new node(6);
       node g=new node(7);
        a.left=b;b.left=d;b.right=e;a.right=c;c.right=f;d.left=g;
        node root1=a;
        node root2=a;
       node root3=merge(root1,root2);
//        System.out.println(root3.data);
        list(root1);
        Collections.sort(lt);

//        sorted list of trees element
        System.out.println(lt);
        node ans=tree(lt);
        System.out.println(ans.data);

//        1
//      /   \
         
//     2      3
//    /  \     \
//   4    5      6
//       /
//      7

    }
}
