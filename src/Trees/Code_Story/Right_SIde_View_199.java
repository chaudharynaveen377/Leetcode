package Trees.Code_Story;

import Trees.*;

import java.util.ArrayList;
import java.util.List;

public class Right_SIde_View_199 {
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
static ArrayList<Integer> lt=new ArrayList<>();

static void right_view(node root,int max_height){
    if (root==null){
        return;
    }
   if (lt.size()<max_height){
       lt.add(root.data);
   }
    right_view(root.right,max_height+1);
    right_view(root.left,max_height+1);
}
static void print(node root){
    if (root==null){
        return;
    }
    System.out.println(root.data);
    print(root.left);
    print(root.right);
}

    public static void main(String[] args) {
      node a=new node(1);
      a.left=new node(2);
      a.right=new node(3);
      a.left.left=new node(4);  a.left.right=new node(5); a.right.left=new node(6);a.right.right=new node(7);
print(a);
right_view(a,1);
        System.out.println(lt);

    }
}
