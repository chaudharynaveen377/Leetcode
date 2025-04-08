package Aarray.medium;

public class Max_no_fish_2658 {
//    static int checkRows(int [][]arr,int xidx,int yidx){
//        int ans=0;
//        for (int i=yidx+1;i<arr[0].length;i++){
//            if (arr[xidx][i]==0){
//                break;
//            }
//            else {
//                ans=ans+arr[xidx][i];
//
//            }
//        }for (int i=yidx-1;i>=0;i--){
//            if (arr[xidx][i]==0){
//                break;
//            }
//            else {
//                ans=ans+arr[xidx][i];
//
//            }
//        }  for (int i=yidx+1;i<arr[0].length;i++){
//            if (arr[xidx][i]==0){
//                break;
//            }
//            else {
//
//                arr[xidx][i]=ans;
//            }
//        }for (int i=yidx-1;i>=0;i--){
//            if (arr[xidx][i]==0){
//                break;
//            }
//            else {
//                arr[xidx][i]=ans;
//
//            }
//        }
//        arr[xidx][yidx]=ans;
//        return ans;
//    }
//    static int checkRCols(int [][]arr,int xidx,int yidx){
//        int ans=0;
//        for (int i=xidx+1;i<arr.length;i++){
//            if (arr[i][yidx]==0){
//                break;
//            }
//            else {
//                ans=ans+arr[i][yidx];
//            }
//        }
//        for (int i=xidx-1;i>=0;i--){
//            if (arr[i][yidx]==0){
//                break;
//            }
//            else {
//                ans=ans+arr[i][yidx];
//            }
//        } for (int i=xidx+1;i<arr.length;i++){
//            if (arr[i][yidx]==0){
//                break;
//            }
//            else {
//                ans=ans+arr[i][yidx];
//            }
//        }
//        for (int i=xidx-1;i>=0;i--){
//            if (arr[i][yidx]==0){
//                break;
//            }
//            else {
//                ans=ans+arr[i][yidx];
//            }
//        }
//
//        return ans;
//    }
//    static int logic(int arr[][]){
//        int ans=0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[0].length;j++){
//                if (arr[i][j]!=0){
//                    ans=Math.max(ans,(checkRows(arr,i,j)+arr[i][j]+checkRCols(arr,i,j)));
//                }
//            }
//        }
//        return ans;
//    }
    static int ans=0;
static void dfs(int[][] arr, int i, int j, boolean[][] visited) {
    if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || visited[i][j] || arr[i][j] == 0) {
        return ;
    }

    // Mark the current cell as visited
    visited[i][j] = true;
ans=ans+arr[i][j];
    // Explore in all 4 possible directions (up, down, left, right)
    dfs(arr, i + 1, j, visited); // Down
    dfs(arr, i - 1, j, visited); // Up
    dfs(arr, i, j + 1, visited); // Right
    dfs(arr, i, j - 1, visited); // Left

}
    public static void main(String[] args) {
       int[][] grid = {{4,3},{
           1,3
       }};
       boolean visited[][]=new boolean[grid.length][grid[0].length];
        dfs(grid,0,0,visited);

        System.out.println(ans);


    }
}
