package HashMap;
import java.util.HashMap;
public class frequency {
    public static void main(String[] args) {
        int arr[]={2,1,2,1,3,3,5,6};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int el:arr){
            if (!mp.containsKey(el)){
                mp.put(el,1);
            }
            else {
                mp.put(el,mp.get(el)+1);
            }
        }
        System.out.println(mp);
    }
}
