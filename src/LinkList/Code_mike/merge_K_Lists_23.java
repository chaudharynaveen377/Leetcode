package LinkList.Code_mike;

import java.util.ArrayList;

public class merge_K_Lists_23 {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            node next=null;
        }
        node() {
        }
    }
public static node merge(node a,node b){
        node temp1=a;
        node temp2=b;
        node newnodeHead=new node(-1);
        node ans=newnodeHead;
        while (temp1!=null && temp2!=null) {
            if (temp1.data <= temp2.data) {
                newnodeHead.next = temp1;
                temp1 = temp1.next;
                newnodeHead = newnodeHead.next;
            } else {
                newnodeHead.next = temp2;
                temp2 = temp2.next;
                newnodeHead = newnodeHead.next;

            }
        }
            if (temp1==null){
                while (temp2!=null){
                    newnodeHead.next=temp2;
                    newnodeHead=newnodeHead.next;
                    temp2=temp2.next;
                }
                newnodeHead=null;
            }
            if (temp2==null){
                while (temp1!=null){
                    newnodeHead.next=temp1;
                    newnodeHead=newnodeHead.next;
                    temp1=temp1.next;
                }
                newnodeHead=null;
            }

    return ans.next;
}
static void disp(node root){
        while (root!=null){
            System.out.println(root.data);
            root=root.next;
        }
}

static node recursive(node a,node b){
    if (a==null ){
        return b;
    } if (b==null ){
        return a;
    }
       if (a.data<=b.data){
          a.next= recursive(a.next,b);;
          return a;
       }
       else {b.next=recursive(a,b.next);;
           return b;
       }

}
static node merging(ArrayList <node> lt,int start,int end){
        if (start==end){
            return lt.get(start);
        }
        if (start>end){
            return null;
        }
        int mid=start+(end-start)/2;
        node l=merging(lt,mid+1,end);
        node r=merging(lt,start,mid);
        return recursive(l,r);
}
    public static void main(String[] args) {
        node a = new node(1);
        a.next = new node(3);
        a.next.next = new node(5);
        node b = new node(2);
        b.next = new node(4);
        b.next.next = new node(6);
        node c=new node(10);
        c.next=new node(12);
        c.next.next=new node(14);
        c.next.next.next=new node(16);
        ArrayList<node>lt=new ArrayList<>();
        lt.add(a);
        lt.add(b);
        lt.add(c);
        disp(merging(lt,0,lt.size()-1));
    }
}