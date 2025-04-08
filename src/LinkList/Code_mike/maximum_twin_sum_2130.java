package LinkList.Code_mike;

import java.util.ArrayList;

public class maximum_twin_sum_2130 {
static class node{
    int data;
    node next;
    node(int data){this.data=data;this.next=null;}
    node(){}
}
static ArrayList<Integer>lt=new ArrayList<>();
static void LL_to_List(node head){
    while (head!=null){
        lt.add(head.data);
        head=head.next;
    }
}
static int Max_twin(){
    int ans=0;
    for (int i=0;i<lt.size()/2;i++){
        ans=Math.max(ans,(lt.get(i)+lt.get(lt.size()-1-i)));
    }
    return ans;
}

public static void main(String[] args) {
    //    [5,4,2,1]
    node a = new node(5);
            a.next = new node(4);
            a.next.next = new node(20);
            a.next.next.next = new node(3);
            a.next.next.next.next = new node(5);
//
            node head = a;
            LL_to_List(head);
    System.out.println(lt);
    System.out.println(Max_twin());
}
}
