package Daily_Leetcodde.java.Medium;

import java.util.Arrays;
import java.util.Comparator;

public class count_vovel_string_2559 {
static int[] prifixSum(String str[]){
    int [] ans=new int[str.length];
    int count=0;
    for (int i=0;i<str.length;i++){
        if ((str[i].charAt(0)=='a' || str[i].charAt(0)=='e' || str[i].charAt(0)=='i' || str[i].charAt(0)=='o' || str[i].charAt(0)=='u'  ) &&
                ( str[i].charAt(str[i].length()-1)=='a' || str[i].charAt(str[i].length()-1)=='e' || str[i].charAt(str[i].length()-1)=='i' || str[i].charAt(str[i].length()-1)=='o' || str[i].charAt(str[i].length()-1)=='u'  )){
            count++;
        }
        ans[i]=count;

    }
    return ans;
}

static int [] logic(int arr[],int arr1[][]){
    int ans[]=new int[arr1.length];
    for (int i=0;i<arr1.length;i++){
        if(arr1[i][0]==0){
            ans[i]=arr[arr1[i][1]];
        }
        else {
        ans[i]=arr[arr1[i][1]]-arr[arr1[i][0] -1];}
    }
    return ans;
}
    static void disp(int arr[]){
        for (int val:arr)
            System.out.println(val);
    }
    public static void main(String[] args) {
//        ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
        String[] str={"aba","bcb","ece","aa","e"}; // 1 1 2 3 4
        boolean[]dp=new boolean[str.length];

        int arr[][]={{0,2},{1,4},{1,1}};
//        disp(prifixSum(str));
        disp(logic(prifixSum(str),arr));

    }
}
//