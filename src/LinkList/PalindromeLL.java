package LinkList;
public class PalindromeLL {
    static class node{
        int data;
        node next;
        node(){
        }
        node(int data ){
            this.data=data;
        }
    }
    static node mid(node head){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static Boolean palindrome(node head){
//        1...> find mid
//        2...> reverse from mid
//        3...> check left and right
        node prev=null;
        node curr=mid(head);
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node left=head;
        node right=prev;
        while( right!=null){
            if (left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node c1=new node(3);
        node d=new node(2);
        node e=new node(1);
        a.next=b;b.next=c;c.next=c1;c1.next=d;d.next=e;
        System.out.println(palindrome(a));
    }
}
