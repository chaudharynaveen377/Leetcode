package LinkList;
import java.util.Scanner;
public class LLqst {
    public static class node{
        public Object left;
        int data;
    node next;
    public node(){
    }
    node(int data){
        this.data=data;
    }
}

    public static void main(String[] args) {


//        can we delete a node given the node itself as parameter
        node sc = new node(5);

        for (int i = 0; i < 3; i++) {
            Scanner ch = new Scanner(System.in);
            int x = ch.nextInt();
            node temp = new node(x);
            sc.next = temp;
            sc=temp;


        }

        while (sc != null) {
        System.out.println(sc.data);
        sc=sc.next;
    }
    }
}
