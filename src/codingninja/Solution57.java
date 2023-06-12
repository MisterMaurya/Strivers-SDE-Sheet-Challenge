package codingninja;

// https://www.codingninjas.com/codestudio/problems/valid-sudoku_8230704?challengeSlug=striver-sde-challenge
// 57. Valid Sudoku
public class Solution57 {


    public static boolean isItSudoku(int[][] matrix) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 1; k <= 9; k++) {
                        if (!blackBox(k, i, j, matrix)) {
                            continue;
                        }
                        matrix[i][j] = k;
                        if (isItSudoku(matrix))
                            return true;
                        else
                            matrix[i][j] = 0;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean blackBox(int num, int i, int j, int[][] matrix) {


        for (int k = 0; k < 9; k++) {
            if (matrix[i][k] == num)
                return false;
            if (matrix[k][j] == num)
                return false;

            int row = (3 * (i / 3)) + k / 3;
            int col = (3 * (j / 3)) + k % 3;

            if (num == matrix[row][col])
                return false;

        }
        return true;
    }
}
