package AATRYaa;

import java.util.ArrayList;

public class t0Darray {
    public static void main(String[] args) {
//        pending time
        int arr[][]={{5,2},{5,4},{10,3},{20,1}};
        int rows=arr.length;
        int columns=arr[0].length;
        int [] lst=new int[rows*columns];
        int avg=0;
        int k=0;
        for (int i=0;i<rows;i++){
            for (int j=0;j< columns;j++){
               lst[k]=(arr[i][j]);
               k++;
            }
        }
            int p1=0;
            int p2=1;
            int st=0;
           while (p1 !=rows*columns && p2!=rows*columns){
            if (lst[p1]>st){
                st=lst[p1]+lst[p2];
            }
            else st=st+lst[p2];
            avg=avg+st-lst[p1];
            p1=p1+2;
            p2=p2+2;
        }
        System.out.println((double) (avg)/(double) (rows));
    }
}
