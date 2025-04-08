package Daily_Leetcodde.java.Medium;

import java.util.ArrayList;

public class shortestPath_3243 {
    static class node{
                        int data;
        node next;
        node(){
        }
        node(int data){
            this.data=data;
        }
    }
    static ArrayList<Integer>lt=new ArrayList<>();
    static node add(int n){
        int i=0;
        node ans=new node(-1);
        node temp=ans;
        while (n>=0){
            node a=new node(i++);
            ans.next=a;
            ans=ans.next;
            n--;
        }
        return temp.next;
    }
//     [[2,4],[0,2],[0,4]]

    private static int size(node h1) {
        int count=0;
        while (h1!=null){
            count++;
            h1=h1.next;
        }
        return count;
    }
    private static node remove(node head, int st, int end) {
        node ans=head;
        node temp1=null;
        node temp2=null;
        while (head!=null){
            if (head.data==st){
                temp1=head;
            }
            if (head.data==end){
                temp2=head;
            }
            head=head.next;
        }
        if (temp1!=null && temp2!=null){
        temp1.next=temp2;}
        return ans;
    }
    static int[] sortest(int n,int arr[][],int ans[]){
        node head=add(n-1);
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            int st=arr[i][0];
            int end=arr[i][1];
            node h1=remove(head,st,end);
            min=Math.min(min,size(h1));
            ans[i]=(min-1);
        }
        return ans;
    }

//    Approach 2 using recursion
    static int recur(node head,int n){
        return 0;
    }
    public static void main(String[] args) {
//        disp(add(5));
        int arr[][]={{2,4},{0,2},{0,4}};
        int ans[]=new int[arr.length];
        System.out.println(sortest(5,arr,ans));
        System.out.println(lt);
    }
    static void disp(node head){
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

}
