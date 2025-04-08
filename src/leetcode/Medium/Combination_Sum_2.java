package leetcode.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Combination_Sum_2 {
//    Input: candidates = [10,1,2,7,6,1,5], target = 8
//    Output:
//            [
//            [1,1,6],
//            [1,2,5],
//            [1,7],
//            [2,6]
//            ]

    static int sum(ArrayList<Integer> lt){
        int ans=0;
       for (int i=0;i<lt.size();i++){
           ans=ans+lt.get(i);
       }
       return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
//        1 ,1 ,2 ,5 ,6 ,7 ,10
        Arrays.sort(arr);
        ArrayList<Integer> lt=new ArrayList<>();
//        lt.add(1);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int target=8;
        for (int i=0;i<arr.length;i++){
            lt=new ArrayList<>();
            for (int j=i;j<arr.length;j++){
                if (sum(lt)<target){
                    lt.add(arr[j]);
                }if (sum(lt)>target ){
                    lt.removeLast();
                }
                if (sum(lt)==target){
                    ans.add(lt);
                   
                }
//                System.out.println(lt)
            }
        }
        System.out.println(ans);
    }
}
