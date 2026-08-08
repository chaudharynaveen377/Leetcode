class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int x1 = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] != 1) {
                arr[i][0] = x1;
            } else {
                x1 = 0;
                arr[i][0] = 0;
            }
        }

        x1 = arr[0][0]; // reset to the start cell's reachability

        for (int j = 1; j < arr[0].length; j++) {
            if (arr[0][j] != 1) {
                arr[0][j] = x1;
            } else {
                x1 = 0;
                arr[0][j] = 0;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                int x = arr[i][j - 1];
                int y = arr[i - 1][j];
                arr[i][j] = (arr[i][j] != 1) ? x + y : 0;
            }
        }

        return arr[arr.length - 1][arr[0].length - 1];
    }
}