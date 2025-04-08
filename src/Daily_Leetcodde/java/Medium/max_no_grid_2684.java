package Daily_Leetcodde.java.Medium;

public class max_no_grid_2684 {
     static int maxMoves(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] memo = new int[rows][cols];
        int maxPath = 0;

        for (int i = 0; i < rows; i++) {
            maxPath = Math.max(maxPath, maxGrid(grid, i, 0, memo, 0));
        }

        return maxPath;
    }

    public static int maxGrid(int[][] arr, int x, int y, int[][] memo, int prevValue) {
        // Check boundaries, already visited, or if the current cell is not increasing
        if (x < 0 || x >= arr.length || y >= arr[0].length || arr[x][y] <= prevValue) {
            return 0;
        }

        // Return memoized result if available
        if (memo[x][y] > 0) {
            return memo[x][y];
        }

        int temp = arr[x][y];
        int maxCount = 1; // Start path count at 1 for the current cell

        // Calculate paths in each direction and take the max
        maxCount = Math.max(maxCount, 1 + maxGrid(arr, x - 1, y + 1, memo, temp)); // Diagonal up-right
        maxCount = Math.max(maxCount, 1 + maxGrid(arr, x, y + 1, memo, temp));     // Right
        maxCount = Math.max(maxCount, 1 + maxGrid(arr, x + 1, y + 1, memo, temp)); // Diagonal down-right

        // Store the result in memo
        memo[x][y] = maxCount;
        return maxCount;

    }
//[[2,4,3,5],[5,4,9,3],[3,4,2,11],[10,9,13,15]]
    public static void main(String[] args) {
        int[][] arr ={{2,4,3,5},{5,4,9,3},{3,4,2,11},{10,9,13,15}};
        System.out.println(maxMoves(arr)-1);
    }
}
