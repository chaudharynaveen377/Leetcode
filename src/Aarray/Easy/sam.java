package Aarray.Easy;

import com.sun.jdi.IntegerValue;

public class sam {
    static int search(int[]arr){

        int ans= Integer.MAX_VALUE;
//        int s=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
//                System.out.println(s);

            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(search(arr));
    }



}
