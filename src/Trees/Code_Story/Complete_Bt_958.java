package Trees.Code_Story;

import java.util.LinkedList;
import java.util.Queue;

public class Complete_Bt_958 {
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
  static boolean BSF(node root){
      Queue<node> que= new LinkedList<>();
      que.add(root);
      boolean check=true;
      while (!que.isEmpty()){
        node newnode = que.poll();
          if (newnode==null){
              check=false;
          }
          else {
              if (check==false){
                  return false;
              }
          }
          if (newnode!=null) {
              que.add(newnode.left);
              que.add(newnode.right);
          }
      }
        return true;
  }
    public static void main(String[] args) {
        node a=new node(1);

        a.left=new node(2);a.right=new node(3);
      a.left.left=new node(4);  a.left.right=new node(5); a.right.right=new node(7);
        System.out.println(BSF(a));
    }
}
