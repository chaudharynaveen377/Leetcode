package MY_Approaches;

public class sudoku_Solver {

        private static final int SIZE = 9;


        private static boolean solveSudoku(int[][] board) {
            for (int row = 0; row < SIZE; row++) {
                for (int col = 0; col < SIZE; col++) {
                    if (board[row][col] == 0) {
                        for (int num = 1; num <= SIZE; num++) {
                            if (isValid(board, row, col, num)) {
                                board[row][col] = num;
                                if (solveSudoku(board)) {
                                    return true;
                                }
                                board[row][col] = 0;
                            }
                        }
                        return false;
                    }
                }
                }

            return true;
        }

        private static boolean isValid(int[][] board, int row, int col, int num) {
            for (int i = 0; i < SIZE; i++) {
                if (board[row][i] == num || board[i][col] == num ||
                        board[row - row % 3 + i / 3][col - col % 3 + i % 3] == num) {
                    return false;
                }
            }
            return true;
        }

        private static void printBoard(int[][] board) {
            for (int row = 0; row < SIZE; row++) {
                for (int col = 0; col < SIZE; col++) {
                    System.out.print(board[row][col] + " ");
                }
                System.out.println();
            }
        }


    public static void main(String[] args) {

            int[][] board = {
                    {3, 0, 6, 5, 0, 8, 4, 0, 0},
                    {5, 2, 0, 0, 0, 0, 0, 0, 0},
                    {0, 8, 7, 0, 0, 0, 0, 3, 1},
                    {0, 0, 3, 0, 1, 0, 0, 8, 0},
                    {9, 0, 0, 8, 6, 3, 0, 0, 5},
                    {0, 5, 0, 0, 9, 0, 6, 0, 0},
                    {1, 3, 0, 0, 0, 0, 2, 5, 0},
                    {0, 0, 0, 0, 0, 0, 0, 7, 4},
                    {0, 0, 5, 2, 0, 6, 3, 0, 0}
            };

            if (solveSudoku(board)) {
                printBoard(board);
            } else {
                System.out.println("No solution exists");
            }
        }



}
