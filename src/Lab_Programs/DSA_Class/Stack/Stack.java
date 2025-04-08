package Lab_Programs.DSA_Class.Stack;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Pushes an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push  :Stack Over flow error: " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    // Pops the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.:stack under flow error:");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Peeks at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Checks if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Returns the current size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack st=new Stack(10);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.pop();
        System.out.println(st.peek());
    }
//    ICPC

}
