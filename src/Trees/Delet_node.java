package Trees;

import java.util.ArrayList;

public class Delet_node {
    static ArrayList<All_in_list.node>lt=new ArrayList<>();
    static All_in_list.node remove(All_in_list.node root,int []arr){
        if (root==null){
            return null;
        }
        if (check(root,arr)){
            lt.add(null);
            return null;
        }
        lt.add(root);
        remove(root.left,arr);
       remove(root.right,arr);
        return root;

    }
    static boolean check(All_in_list.node root,int [] arr){
        for (int i=0;i<arr.length;i++){
            if (root.data==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        All_in_list.node a=new All_in_list.node(1);
        All_in_list.node b=new All_in_list.node(2);
        All_in_list.node c=new All_in_list.node(3);
        All_in_list.node d=new All_in_list.node(4);
        All_in_list.node e=new All_in_list.node(5);
        All_in_list.node f=new All_in_list.node(6);
        All_in_list.node g=new All_in_list.node(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        int arr[]={3,5};
//        System.out.println(check(a,arr));
        remove(a,arr);
        System.out.println(lt);
    }
}
