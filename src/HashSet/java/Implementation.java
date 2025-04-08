package HashSet.java;

import java.util.HashSet;

public class Implementation {
    public static void main(String[] args) {
        HashSet<Integer> ht=new HashSet<>();
        ht.add(3);
        ht.add(3);
        ht.add(3);
        ht.add(3);
        ht.add(5);
        System.out.println(ht.size());
        System.out.println(ht.add(6));
        System.out.println(ht);

    }
}
