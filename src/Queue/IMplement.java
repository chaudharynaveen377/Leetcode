package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class IMplement {
    public static void main(String[] args) {
        Queue<Integer> qu=new LinkedList<>();
        qu.add(6);
        qu.add(5);
        qu.add(4);
        qu.add(3);
        System.out.println(qu.poll());
        System.out.println();
    }
}
