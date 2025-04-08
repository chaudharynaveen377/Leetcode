package Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arralsst {
    static void swap(ArrayList<Integer> lst,int idx1,int idx2){
      int temp= lst.get(idx1);
      lst.set(idx1,lst.get(idx2));
      lst.set(idx2,temp);
    }
    public static void main(String[] args) {
     ArrayList<Integer> lst=new ArrayList<>();
     lst.add(5);
     lst.add(6);
     lst.add(7);
     lst.add(9);
        lst.add(4);
        System.out.println(lst);
     swap(lst,3,2);
        Collections.sort(lst);
        System.out.println(lst);

    }
}
