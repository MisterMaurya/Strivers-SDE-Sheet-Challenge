package codingninja;

import java.util.Arrays;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/unique-paths_8230802?challengeSlug=striver-sde-challenge]
 * @author: Pawan Maurya
 */
public class Solution17 {
    public static int uniquePaths(int m, int n) {
        // DP Array
        int[][] dp = new int[m][n];
        Arrays.stream(dp).forEach(i -> Arrays.fill(i, -1));
        return uniquePaths(m - 1, n - 1, dp);
    }

    public static int uniquePaths(int m, int n, int dp[][]) {
        if (n == 0 && m == 0)
            return 1;

        if (n < 0 || m < 0)
            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        int up = uniquePaths(m - 1, n, dp);
        int left = uniquePaths(m, n - 1, dp);

        return dp[m][n] = up + left;
    }
}