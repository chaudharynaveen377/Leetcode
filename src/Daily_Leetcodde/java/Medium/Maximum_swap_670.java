package Daily_Leetcodde.java.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Maximum_swap_670 {
    static ArrayList<Integer> int_array(int x){
        ArrayList<Integer> lt=new ArrayList<>();
        while (x!=0){
            int add=x%10;
            x=x/10;
            lt.add(add);
        }
        return new ArrayList<>(lt.reversed());
    }
    static void swap(int[] arr,int idx1,int idx2){
      int temp=arr[idx1];
      arr[idx1]=arr[idx2];
      arr[idx2]=temp;
    }
    public static void main(String[] args) {
//        Tricky Test Cases on which I failed
//        1993
//        98368
        int x=2736;
        ArrayList<Integer> lt=int_array(x);
        int[] arr = new int[lt.size()];
        for (int i = 0; i < lt.size(); i++) {
            arr[i] = lt.get(i);
        }
        System.out.println(lt);
        int max=0;
        int sidx=-1;
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                 if (arr[j]>=max){
                     max=Math.max(max,arr[j]);
                     sidx=j;
                    }
                }
            if (arr[i]<arr[sidx]){
                swap(arr,i,sidx);
                break;
            }
            max=0;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
