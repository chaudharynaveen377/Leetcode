package Trees;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevels {
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
    static List<Double> lst=new ArrayList<>();
 public  static List<Double> average(node root){
if (root.left==null && root.right==null){
    return lst;
}
if (root.left==null) {lst.add((double)root.right.data);
return lst;
    }
if (root.right==null) {lst.add((double)root.left.data);
return lst;
    }
double dummy=(double)(root.left.data +root.right.data)/(double)2;
lst.add(dummy);
average(root.left);
average(root.right);
return lst;

 }
    public static void main(String[] args) {
        node a=new node(1);
       node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
       node f=new node(6);
       node g=new node(7);
       node h=new node(8);
        a.right=c;a.left=b;
        b.left=d;b.right=e;
        d.left=g;
        c.right=f;
        f.right=h;
        node root=a;
        average(root);
        lst.add((double)root.data);
        System.out.println(lst);
    }
}
