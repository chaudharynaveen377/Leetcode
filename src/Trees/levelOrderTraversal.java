package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {

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
    static List<List<Integer>> ans=new ArrayList<>();
     static  List<Integer> lt=new ArrayList<>();
  public static void levelOrder(node root){
        if (root==null){
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){

            node currnode =q.remove();
            if (currnode==null){
                ans.add(lt);
                lt=new ArrayList<>();
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else{q.add(null);
            }
            }
            else{

                lt.add(currnode.data);
                System.out.print(currnode.data+" ");
                if (currnode.left!=null){
                    q.add(currnode.left);
                }
                if (currnode.right!=null){
                    q.add(currnode.right);
                }
            }

        }
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
        node root=a;
//        level order traversal
        levelOrder(root);
        System.out.println(ans);

    }
}
