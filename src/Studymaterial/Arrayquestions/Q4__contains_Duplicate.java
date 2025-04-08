package Studymaterial.Arrayquestions;

import java.util.HashMap;

public class Q4__contains_Duplicate {
    public static void main(String[] args) {


        int nums[] = {1, 2, 3, 0};
       Boolean flag=false;
       HashMap<Integer,Integer>mp=new HashMap<>();
       for (int i=0;i<nums.length;i++){
           if (!mp.containsKey(nums[i])){
               mp.put(nums[i],1);
           }
           else flag=true;
       }
        System.out.println(flag);
    }
}