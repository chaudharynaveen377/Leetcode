package ToDArray;

public class Number_OF_islands {
    static void dfs(String[][] grid,int i,int j){
        if ( i>= grid.length || j>= grid[0].length || i<0 || j<0 || grid[i][j]!="1" ){
            return;
        }
        grid[i][j]="$";

        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);

    }
    public static void main(String[] args) {
      String [][]grid = {
              {"1", "1", "1", "1", "0"},
              {"1", "1", "0", "1", "0"},
              {"1","1","0","0","0"},
              {"0","0","0","1","1"}};
      int countIsland=0;
      for (int i=0;i< grid.length;i++){
          for (int j=0;j< grid[0].length;j++){
              if (grid[i][j]=="1"){
              dfs(grid,i,j);
              countIsland++;
          }
          }
      }
        System.out.println(countIsland);
    }
}
