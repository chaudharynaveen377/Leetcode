package Daily_Leetcodde.java.Hard;
import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static List<String> createBoard(int[][] board) {
        List<String> result = new ArrayList<>();
        for (int[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (int cell : row) {
                sb.append(cell == 1 ? "Q" : ".");
            }
            result.add(sb.toString());
        }
        return result;
    }

    static boolean nqueen(int[][] board, int row, int n, List<List<String>> solutions) {
        if (row == n) {
            solutions.add(createBoard(board));
            return true;
        }

        boolean foundSolution = false;

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                foundSolution = nqueen(board, row + 1, n, solutions) || foundSolution;
                board[row][col] = 0;
            }
        }
        return foundSolution;
    }


    static boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        List<List<String>> solutions = new ArrayList<>();

        nqueen(board, 0, n, solutions);
            for (List<String> solution : solutions) {
                for (String row : solution) {
                    System.out.println(row);
                }
                System.out.println();
        }
    }
}
