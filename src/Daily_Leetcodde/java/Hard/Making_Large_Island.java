package Daily_Leetcodde.java.Hard;

import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Making_Large_Island {
     static int dfs(int[][] grid, int i, int j,int val) {
         if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
             return 0;
         }
         grid[i][j] = val;
         return 1+ dfs(grid, i + 1, j,val)+
          dfs(grid, i - 1, j,val)+
                 dfs(grid, i, j + 1,val)+
                  dfs(grid, i, j - 1,val);
     };
   static HashMap<Integer,Integer>mp=new HashMap<>();
     static void generate_Key(int arr[][]){
         int n=arr.length;
         int val=2;

         for (int i=0;i<n;i++){
             for (int j=0;j<n;j++){
                 if (arr[i][j]==1){
                    mp.put(val,dfs(arr,i,j,val++));
                 }
             }
         }

     }
//    public static int largestIsland(int[][] grid) {
//        int rows = grid.length;
//        int cols = grid[0].length;
//        int maxIslandSize = 0;
//
//        // Iterate through each cell in the grid
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                // If it's a 0, consider flipping it to 1
//                if (grid[i][j] == 0) {
//                    grid[i][j] = 1; // Flip 0 to 1
//
//                    // Create a deep copy of the grid to calculate the island size
//                    int[][] copy = Arrays.stream(grid).map(int[]::clone).toArray(int[][]::new);
//
//                    // Calculate the island size using DFS
//                    int islandSize = dfs(copy, i, j);
//
//                    // Update the maximum island size
//                    maxIslandSize = Math.max(maxIslandSize, islandSize);
//
//                    // Restore the cell back to 0
//                    grid[i][j] = 0;
//                }
//            }
//        }
//
//        // If no 0 was flipped (the grid is full of 1s), return the total grid size
//        return maxIslandSize == 0 ? rows * cols : maxIslandSize;
//    }

    // DFS Helper function to calculate island size

    static int logic(int arr[][],HashMap<Integer,Integer> mp){
         int ans=0;
         boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j< arr.length;j++){
                if (arr[i][j]==0){
                    flag=false;
                    ArrayList<Integer>lt=new ArrayList<>();
                    lt.add(-1);
                    int sum=1;
                    if (i+1<arr.length && arr[i+1][j]!=0 && !lt.contains(arr[i+1][j])){
                        sum=sum+mp.get(arr[i+1][j]);
                        lt.add(arr[i+1][j]);
                    }if (i-1>=0&&arr[i-1][j]!=0 && !lt.contains(arr[i-1][j])){
                        sum=sum+mp.get(arr[i-1][j]);
                        lt.add(arr[i-1][j]);
                    }if (j+1<arr.length && arr[i][j+1]!=0 && !lt.contains(arr[i][j+1])){
                        sum=sum+mp.get(arr[i][j+1]);
                        lt.add(arr[i][j+1]);
                    }if (j-1>=0 && arr[i][j-1]!=0 && !lt.contains(arr[i][j-1])){
                        sum=sum+mp.get(arr[i][j-1]);
                        lt.add(arr[i][j-1]);
                    }
                    ans=Math.max(ans,sum);
                }

            }

        }
        return flag? arr.length*arr.length : ans;
    }

     public static void main(String[] args) {
         int grid[][]={{1,0,0,1},
                       {1,1,1,1},
                       {1,0,0,1},
                       {1,0,0,1}};
         generate_Key(grid);
         System.out.println(Arrays.deepToString(grid));
         System.out.println(mp);
         System.out.println(logic(grid,mp));

     }
}
