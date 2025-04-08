package Trees;

import java.util.ArrayList;

public class Cons_BT_PR_INorder {
    static class node{
                int data;
        node left;
        node right;
        node(){}
        node(int data){
            this.data=data;
        }
    }
    static ArrayList<Integer> lt=new ArrayList<>();
    static void treeArray(int arr[],int arr1[]){
        int ptr=0;
        int ptr1=0;
        int i=0;
        while (ptr!=arr.length&& ptr1!=arr1.length){
            if (arr[ptr]==arr1[ptr1] && ptr!=ptr1){
                ptr=ptr+1;
                while(i!=ptr){
                    lt.add(arr[i]);
                    i++;
                }
                lt.add(-1);
                lt.add(-1);
                if (arr[ptr]==arr1[ptr1] && ptr!=ptr1){

                }

                ptr1=i;

            }
            if (ptr!=arr.length&& ptr1!=arr1.length && arr[ptr]==arr1[i]){
                lt.add(-1);
            }

            ptr++;

        }
    }
    public static void main(String[] args) {
        node a=new node(1);
        a.left=new node(3);
        a.right=new node(3);
        a.left.left=new node(3);
        a.left.right=new node(2);
        a.right.left=new node(4);
        a.right.right=new node(4);
        node root=a;
        int arr[]={3,9,10,20,15,7};
        int arr1[]={9,10,3,15,20,7};
        treeArray(arr,arr1);
        System.out.println(lt);
    }
}
