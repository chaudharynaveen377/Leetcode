package A_Copilot;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Odd_Even_328 {
    static Node oddEven(Node head) {
        if (head == null) {
            return null; // Return null if the list is empty
        }
        Node oddHead = null; // Starting node for odd-indexed list
        Node oddTail = null; // Pointer to build the new odd-indexed list
        Node current = head;
        int index = 1; // Start from index 1 (considering 1-based index)
Node evenHead=null;
Node evenTail=null;
        while (current != null) {
            if (index % 2 != 0) {
                if (oddHead == null) {
                    oddHead = current; // Initialize the head of odd-indexed list
                    oddTail = oddHead;
                } else {
                    oddTail.next = current; // Append current node to the new list
                    oddTail = oddTail.next;
                }
            }
            else {
                if (evenHead == null) {
                    evenHead = current; // Initialize the head of odd-indexed list
                    evenTail = evenHead;
                } else {
                    evenTail.next = current; // Append current node to the new list
                    evenTail = evenTail.next;
                }
            }
            current = current.next;
            index++;
        }
         oddTail.next=evenHead;
        if (evenTail != null) {
            evenTail.next = null; // End of the list should point to null
        }
        return oddHead; // Return the head of the new odd-indexed list
    }

    // Method to print the list (for testing)
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        Node oddHead = oddEven(head);
        printList(oddHead); // Expected output: 1 3 5 7
    }
}
