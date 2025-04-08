package LinkList.Code_mike;

import java.util.ArrayList;

public class Delete_Nodes_3217 {
    static class node{
                int data;
    node next;
    node(int data){this.data=data;}
    node(){}
}
    static void disp(node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
}
static node deleteNodes(node head,ArrayList<Integer> lt){
        node newnode =new node(-1);
        node ans=newnode;
        while(head!=null){
            if (!lt.contains(head.data)){
                newnode.next=head;
                newnode=newnode.next;
            }
            head=head.next;
        }
        newnode.next=null;
        return ans.next;
}
        // Binary search function
        public static Boolean binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                // Check if target is present at mid
                if (arr[mid] == target) {
                    return true;
                }
                // If target is greater, ignore the left half
                if (arr[mid] < target) {
                    left = mid + 1;
                }
                // If target is smaller, ignore the right half
                else {
                    right = mid - 1;
                }
            }
            // Target is not present in the array
            return false;
        }



    public static void main(String[] args) {
            node a=new node(1);
            a.next = new node(2);
            a.next.next = new node(3);
            a.next.next.next = new node(4);
            a.next.next.next.next = new node(5);
            a.next.next.next.next.next = new node(6);
            node head=a;
        int arr[]={1,2,3};

    }
}
