package Daily_Leetcodde.java.Medium;

import java.util.ArrayList;
import java.util.List;

public class leet_769 {
    static boolean check(int arr[]){
        boolean f1=true;
        boolean f2=true;
        for (int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                f1=false;
            }
        } for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[i-1]){
                f2=false;
            }
        }
        return f1 || f2;
    }
    static List<List<Integer>> logic(int arr[]){
       List<List<Integer>> lt=new ArrayList<>();
        int i=0,j=1;
        List<Integer> lt1=new ArrayList<>();
        lt1.add(arr[0]);
        while (j<arr.length){
            if (arr[i]>=arr[j]){
                lt1.add(arr[j]);
                i++;j++;
            }
            else {lt.add(lt1);
                lt1=new ArrayList<>();
                lt1.add(arr[j]);
                i++;
                j++;}
        }
        lt.add(lt1);
        return lt;
    }
    static int merge_check(List<List<Integer>> lt){
        int  x=Integer.MIN_VALUE;
        for (int i=0;i<lt.size();i++){
            if (lt.get(i).get(0)>x){
                x=lt.get(i).get(0);
            }
            else return 1;
        }
return lt.size();
    }
    static int mike_Approach(int arr[]) {
        int n = arr.length;
        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];
        int chunk = 0;

        // Initialize prefixMax and suffixMin
        prefixMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
        }

        suffixMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], arr[i]);
        }

        // Calculate the number of chunks
        for (int i = 0; i < n; i++) {
            int pmax = i > 0 ? prefixMax[i - 1] : Integer.MIN_VALUE;
            int bmin = i < n - 1 ? suffixMin[i + 1] : Integer.MAX_VALUE;

            if (pmax < bmin) {
                chunk++;
            }
        }

        return chunk-1;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,0,3};

        System.out.println(mike_Approach(arr));
    }
}
