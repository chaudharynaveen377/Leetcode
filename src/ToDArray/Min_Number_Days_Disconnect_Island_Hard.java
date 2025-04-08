package ToDArray;

public class Min_Number_Days_Disconnect_Island_Hard {
    static void dfs(int[][] grid,int i,int j){
        if ( i>= grid.length || j>= grid[0].length || i<0 || j<0 || grid[i][j]!=1 ){
            return;
        }
        grid[i][j]=-1;

        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);

    }
    static int numberofIslands(int [][] grid){
        int count=0;
        for (int i=0;i< grid.length;i++){
            for (int j=0;j< grid[0].length;j++){
                if (grid[i][j]==1){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    static void print(int [][] grid){
        for (int i=0;i< grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]grid = {{0,1,1,0},{0,1,1,0},{0,0,0,0}};
        int countIsland=0;
        int days=0;

        if (numberofIslands(grid)!=1){
            System.out.println("zero");
            return;
        }


        print(grid);
            int islands = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        grid[i][j] = 0;
                        islands = Math.max(islands, numberofIslands(grid));
                        grid[i][j] = 1;
                    }
                }
                System.out.println(islands);
                if (islands != 1) {
                    System.out.println("one");
                    return;
                }
            }


        System.out.println("two ");
    }
}
