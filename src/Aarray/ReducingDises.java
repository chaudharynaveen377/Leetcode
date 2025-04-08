package Aarray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReducingDises {
    public static void main(String[] args) {
        int arr[]={4,3,2};
        ArrayList<Integer> lt=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            lt.add(arr[i]);
        }
        Collections.sort(lt);
        int dummy=0;
        int ans=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<lt.size();j++){
                dummy=dummy+lt.get(j)*(j+1);
            }
            if (dummy>=ans){
                ans=dummy;
            }
            dummy=0;
            lt.remove(0);
        }
        System.out.println(ans);
    }
}
