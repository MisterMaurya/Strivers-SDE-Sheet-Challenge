package codingninja;

import java.util.ArrayList;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/n-queens_8230707?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */

public class Solution56 {

    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        int[][] chess = new int[n][n];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        solve(0, n, chess, ans);
        return ans;
    }

    public static void solve(
            int col,
            int n,
            int[][] chess,
            ArrayList<ArrayList<Integer>> ans
    ) {
        if (col == n) {
            ArrayList<Integer> inner = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    inner.add(chess[i][j]);
                }
            }
            ans.add(inner);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (blackBox(col, row, n, chess)) {
                chess[row][col] = 1;
                solve(col + 1, n, chess, ans);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean blackBox(int col, int row, int n, int[][] chess) {
        int c = col - 1;
        int r = row - 1;

        // ROW
        while (c >= 0) {
            if (chess[row][c--] == 1) {
                return false;
            }
        }

        c = col - 1;

        // UPPER
        while (r >= 0 && c >= 0) {
            if (chess[r--][c--] == 1) {
                return false;
            }
        }

        r = row + 1;
        c = col - 1;

        while (r < n && c >= 0) {
            if (chess[r++][c--] == 1)
                return false;
        }
        return true;
    }
}