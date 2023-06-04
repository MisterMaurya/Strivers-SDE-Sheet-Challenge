package codingninja;

import java.util.Arrays;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/longest-common-subsequence_8230681?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */

public class Solution173 {

    public static int lcs(String s, String t) {
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n][m];
        Arrays.stream(dp).forEach(arr -> Arrays.fill(arr, -1));
        return lcs(s, t, dp, n - 1, m - 1);
    }

    public static int lcs(String s, String t, int dp[][], int n, int m) {
        if (n < 0 || m < 0)
            return 0;

        if (dp[n][m] != -1)
            return dp[n][m];

        if (s.charAt(n) == t.charAt(m))
            return 1 + lcs(s, t, dp, n - 1, m - 1);

        return dp[n][m] = Math.max(lcs(s, t, dp, n, m - 1), lcs(s, t, dp, n - 1, m));
    }

}