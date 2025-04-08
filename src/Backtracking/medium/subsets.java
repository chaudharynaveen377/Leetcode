package Backtracking.medium;

import java.util.ArrayList;

public class subsets {
    static void sbst(String str,String ans,int i){
       if (i==str.length()){
           System.out.println(ans);
           return;
       }
       sbst(str,ans+str.charAt(i),i+1);
//        System.out.println(i);
       sbst(str,ans,i+1);
    }
     static void numsubset(int[]nums, ArrayList<Integer> lst,int i,ArrayList<ArrayList<Integer>> lst1){
       if (i==nums.length){
           if (!lst1.contains(lst)){
           lst1.add(lst);
           }
           System.out.println(lst1);
          return;
       }
       lst.add(nums[i]);
       numsubset(nums,lst,i+1,lst1);
//       lst.removeLast();
       numsubset(nums,lst,i+1,lst1);
     }
    public static void main(String[] args) {
        sbst("abc","",0);
        int arr[]={1,2,3};
        ArrayList<Integer> x=new ArrayList<>();
        ArrayList<ArrayList<Integer>> y=new ArrayList<>();
        numsubset(arr,x,0,y);
        System.out.println(y);
    }
}
