package Daily_Leetcodde.java.Hard;

import java.util.ArrayList;

public class Make_mountain_1671 {
//    Input: nums = [2,1,1,5,6,2,3,1]
//    Output: 3
//There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
//    arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//    arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
    public static void main(String[] args) {
        int arr[]={2,1,1,5,6,2,3,1};
        ArrayList<Integer>lt=new ArrayList<>();
        for (int i:arr){
            lt.add(i);
        }
       int i=1;
        int j=arr.length-2;
        while (i<j){
            if (arr[i-1]>=arr[i]){
                lt.remove(i-1);
            }
            if (arr[j]<=arr[j+1]){
                lt.remove(j);
            }
        }
    }
}
