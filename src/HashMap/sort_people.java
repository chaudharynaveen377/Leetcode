package HashMap;

import java.util.Arrays;
import java.util.Arrays.*;
import java.util.Collections;
import java.util.HashMap;

public class sort_people {
    public static void main(String[] args) {
        String []names={"Mary","John","Emma"};
        int heights[]={180,165,170};
        int arr_length= names.length;
        HashMap<Integer,String> mp=new HashMap<>();
        for (int i=0;i< arr_length;i++){
            mp.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for (int i=arr_length-1;i<=0;i--){
            names[i]=mp.get(heights[i]);
        }
        for (int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }
    }
}
