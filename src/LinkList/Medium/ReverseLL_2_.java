package LinkList.Medium;

import LinkList.ReverseLL;

public class ReverseLL_2_ {
    static class node {
                int data;
        node next;
        node() {
        }
        node(int data) {
            this.data = data;
        }
    }
    static node getLeft(node root,int left){
        node temp=root;
        if (left==0 || left==1){
            return temp;
        }
        while (left>1){
            temp=temp.next;
            left--;
        }
        return temp;
    }
    static node getRight(node root,int left,int right){
        int pass=right-left;
        node temp=root;
        while (pass>1){
            temp=temp.next;
            pass--;
        }
        return temp;

    }
    static node lastnode(node root){
        while (root.next!=null){
            root=root.next;
        }
        return root;
    }
    static node reverse(node root,int left,int right){
       node lt1=getLeft(root,left);
       node lt2=lt1.next;
       lt1.next=null;


       node rt1=getRight(lt2,left,right);
       node rt2=rt1.next;
       rt1.next=null;

       lt2=reversell(lt2);
       rt1=lastnode(lt2);

       lt1.next=lt2;
       rt1.next=rt2;

       return root;

    }
    static void print(node root){
        while (root!=null){
            System.out.println(root.data);
            root=root.next;
        }
    }
    public static node reversell(node h1){
        node prev=null;
        node head=h1;
        node curr=new node();
        while (curr!=null){
            curr=head.next;
            head.next=prev;
            prev=head;
            head=curr;
        }
        return prev;

    }
    public static void main(String[] args) {
        node a = new node(1);
            a.next = new node(2);
            a.next.next = new node(3);
            a.next.next.next = new node(4);
            a.next.next.next.next = new node(5);
            node root=a;
node dummy=new node(-1);
dummy.next=a;
//      1--2--3--4--5--null

node root1=reverse(dummy,1 ,3);
print(root1.next);
//        System.out.println(getRight(root,2,4).data);
    }
}
