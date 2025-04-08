package ToDArray;

public class Saddle_point {
    static void dfs(int[][] arr, int i, int j, boolean[][] booleans){
        if (i<0 ||  i>=arr.length || j<0 || j>=arr[i].length || booleans[i][j]){
            return;
        }
        System.out.print(arr[i][j]);
        booleans[i][j]=true;
        dfs(arr,i,j+1, booleans);
        dfs(arr,i+1,j, booleans);
        dfs(arr,i,j-1, booleans);
        dfs(arr,i-1,j,booleans);
    }
    static boolean checkrow(int arr[][],int val,int row){
        int min=Integer.MAX_VALUE;
       for (int i=0;i<arr.length;i++){
           min=Math.min(min,arr[row][i]);
       }
       return min==val;
    }
    static boolean checkcol(int arr[][],int val,int col){
        int min=Integer.MIN_VALUE;
       for (int i=0;i<arr.length;i++){
           min=Math.max(min,arr[i][col]);
       }
       return min==val;
    }
    static int saddle(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (checkrow(arr,arr[i][j], i) && checkcol(arr,arr[i][j], j)){
                    return arr[i][j];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3,4,-1},
                     {4,5,6,7,-1},
                     {4,5,6,7,-1},
                     {4,5,6,7,-1},
                     {7,8,9,0,-3}};
//        System.out.println(saddle(arr));
        dfs(arr,0,0,new boolean[arr.length][arr[0].length]);
    }
}
