package Daily_Leetcodde.java.Medium;

import java.util.ArrayList;

public class BadPairs2364 {
    static int logic(int arr[]){
        if (arr.length<2){
            return -1;
        }
        int ans=0;
        ArrayList<ArrayList<Integer>> lt=new ArrayList<>();
        int y=0;
        ArrayList<Integer>ad=new ArrayList<>();
        ad.add(arr[1]-arr[0]);
        lt.add(new ArrayList<>(ad));
        for (int i=2;i<arr.length;i++){
            ad=new ArrayList<>();
            int count=arr[i]-arr[i-1];
            ad.add(count);
            for (int k=0;k<lt.get(y).size();k++){
                ad.add(count+lt.get(y).get(k));

            }
            y=y+1;
            lt.add(new ArrayList<>(ad));
        }
        System.out.println(lt);
        for (ArrayList<Integer> val:lt){
            for (int k=0;k<val.size();k++){
                if (val.get(k)!=k+1){
                    ans++;
                }

            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        Input: nums = [4,1,3,3]
//        Output: 5
        int nums[]={4,1,3,3};

        System.out.println(logic(nums));
    }
}
