package Aarray;

import java.util.HashMap;

public class next_greater_element_496 {
    static int max(int nums2[],int target,HashMap<Integer,Integer> mp){
        for (int i=0;i< nums2.length;i++){
            if (nums2[i]>target && i> mp.get(target)){
                return nums2[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
//        Output: [-1,3,-1]
        int []nums1={2,4};
        int []nums2={1,2,3,4};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int i=0;i<nums2.length;i++){
            mp.put(nums2[i],i );
        }
        System.out.println(mp);
        for (int i=0;i< nums1.length;i++){
            nums1[i]=max(nums2,nums1[i],mp);
        }
        for (int i=0;i< nums1.length;i++){
            System.out.println(nums1[i]);
        }

    }
}
