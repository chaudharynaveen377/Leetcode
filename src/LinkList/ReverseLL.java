package LinkList;

public class ReverseLL {
    static class node {
        int data;
        node next;
        node() {
        }
        node(int data) {
            this.data = data;
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
    static node reverse(node head) {
        node prev = null;
        node current = head;
        node next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the current node's pointer
            prev = current;      // Move pointers one step forward
            current = next;
        }

        return prev; // New head of the reversed list
    }
        public static void main(String[] args) {
            node a = new node(1);
            a.next = new node(2);
            a.next.next = new node(3);
            a.next.next.next = new node(4);
            a.next.next.next.next = new node(5);
//
            node head = a;
           node x= reverse(head);
            while (x != null) {
                System.out.println(x.data);
                x = x.next;
            }
    }

    }