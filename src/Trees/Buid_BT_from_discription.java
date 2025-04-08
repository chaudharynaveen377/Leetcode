package Trees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Buid_BT_from_discription {
  static  class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        HashMap<Integer,node> mp=new HashMap<>();
        Set<node>st=new HashSet<>();
        for (int i=0;i< arr.length;i++){
            int parent=arr[i][0];
            int child=arr[i][1];
            int l_r_child=arr[i][2];
            if (!mp.containsKey(parent)){
                mp.put(parent,new node(parent));}
            if (!mp.containsKey(child)){
                mp.put(child,new node(child));
            }
            if (l_r_child==1){

            }
        }


    }
}
