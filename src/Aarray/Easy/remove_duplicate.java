package Aarray.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class remove_duplicate {
    public static void main(String[] args) {
//        ArrayList<Integer>lt=new ArrayList<>();
        int nums[]={1,1,2,2,3,4,5,5};
        ArrayList<Integer>lt=new ArrayList<>();
        int i=0,j=0;
        while (i<nums.length){
            int dum=nums[i];
            lt.add(dum);
            j=i+1;
            while (j<nums.length && nums[j]==dum ){
                j++;
            }
            i= j;
        }
        System.out.println((lt));
    }
}
