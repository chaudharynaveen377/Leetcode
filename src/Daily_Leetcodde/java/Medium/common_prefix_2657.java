package Daily_Leetcodde.java.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class common_prefix_2657 {
    public static void main(String[] args) {
        int arr1[]={2,3,1};
        int arr2[]={3,1,2};
//        int x=0,y=0;
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i]=arr1[i]+x;
//            x=arr1[i];
//            arr2[i]=arr2[i]+y;
//            y=arr2[i];
//        }
//        for (int i=0;i<arr1.length;i++){
//            if (arr1[i]==arr2[i]){
//                arr1[i]=i+1;
//            }
//            else {
//                arr1[i]=i;
//            }
//        }
        HashMap<Integer,Integer>mp=new HashMap<>();
        int []ans=new int[arr1.length];
        for (int i=0;i<arr1.length;i++){
            mp.put(arr1[i],i);
        }
        for (int i=0;i<arr1.length;i++){
            int count=0;
            for (int j=0;j< arr1.length;j++){
                if (mp.containsKey(arr2[j]) && mp.get(arr2[j])<=i){
                    count++;
                }
                else {
                    break;
                }
            }
            ans[i]=count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
