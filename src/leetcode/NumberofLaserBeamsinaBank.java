package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberofLaserBeamsinaBank {
    public static void main(String[] args) {
     String arr[]= {"00000","00101","10100","11110","11100","01001","00100","11010"};
        ArrayList<Integer>lst=new ArrayList<>();
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length();j++){
                if (arr[i].charAt(j)=='1'){
                    count++;
                }
            }
            if (count!=0){
            lst.add(count);}
            count=0;
        }
        int ans=0,z=0;
       for (int i=0;i<lst.size()-1;i++){
           z=lst.get(i)*lst.get(i+1);
           ans=ans+z;
           z=0;
       }
        System.out.println(ans);

    }
}
