package BST.Approaches.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class find_mode_530 {
    public static void main(String[] args) {
        ArrayList<Integer>lt=new ArrayList<>();
        int arr[]={4,4,5,8,8,9};
       int maxfreq=0;
       int currfreq=0;
        for (int i=0;i<arr.length;i++){
            if (!lt.contains(arr[i])){
                currfreq=1;
                lt.add(arr[i]);

            }else {
                currfreq++;
            }
            if (maxfreq==currfreq && !lt.contains(arr[i])){
                lt.add(arr[i]);
            }
            if (maxfreq<currfreq){
                maxfreq=currfreq;
            }
//            System.out.println(maxfreq);
            System.out.println(currfreq);

        }
        System.out.println(lt);
    }
}
