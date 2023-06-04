package codingninja;

import java.util.Arrays;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/edit-distance_8230685?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */

public class Solution175 {

    public static int editDistance(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n][m];
        Arrays.stream(dp).forEach(arr -> Arrays.fill(arr, -1));
        return editDistance(str1, str2, n - 1, m - 1, dp);
    }

    public static int editDistance(String str1, String str2, int i, int j, int[][] dp) {

        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;


        if (dp[i][j] != -1)
            return dp[i][j];

        if (str1.charAt(i) == str2.charAt(j))
            return editDistance(str1, str2, i - 1, j - 1, dp);


        int delete = 1 + editDistance(str1, str2, i - 1, j, dp);
        int replace = 1 + editDistance(str1, str2, i - 1, j - 1, dp);
        int insert = 1 + editDistance(str1, str2, i, j - 1, dp);

        return dp[i][j] = Math.min(Math.min(delete, replace), insert);

    }
}