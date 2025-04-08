package Recursion;

import Lab_Programs.DSA_Class.Stack.Stack;

public class sortStack {

        public static Stack sortStack(Stack st) {
            Stack st1 = new Stack(st.size());

            while (!st.isEmpty()) {
                int temp = st.pop();

                while (!st1.isEmpty() && st1.peek() < temp) {
                    st.push(st1.pop());
                }
                st1.push(temp);
            }

            while (!st1.isEmpty()) {
                st.push(st1.pop());
            }
            return st;
        }
    public static void main(String[] args) {

        Stack st=new Stack(5);
        st.push(8);
        st.push(10);
        st.push(6);
        st.push(23);
        st.push(41);


        Stack st1=sortStack(st);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }


    }
}
