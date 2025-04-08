package Aarray.Easy;

public class containerwithMinWater {
    static int minWater(int arr[]){
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                int min=Math.min(arr[i],arr[j]);
                ans=Math.min(ans,min*(j-i));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []height = {1, 8, 6, 2, 5, 4,2,1,1};


        // 1 8 6 2 5 4
        System.out.println(minWater(height));
    }
}
