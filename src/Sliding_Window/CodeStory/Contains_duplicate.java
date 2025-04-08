package Sliding_Window.CodeStory;

import java.util.HashMap;

public class Contains_duplicate {
//    Given an integer array nums and an integer k, return true if there are two distinct
//    indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
//    Input: nums = [1,2,3,1], k = 3
//    Output: true
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,2};
        int k=1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int i=0;
        int j=0;
        while (j<arr.length){
            if (!mp.containsKey(arr[j])){
                mp.put(arr[j],j);
            }
            else {
                if (j- mp.get(arr[j])<=k){
                    System.out.println(true);
                    return;
                }
                mp.put(arr[j],j);
            }
            j++;
        }
        System.out.println(false);

    }
}
