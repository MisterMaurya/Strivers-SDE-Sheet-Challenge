package codingninja;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * @description: [https://www.codingninjas.com/codestudio/problems/0-1-knapsack_8230801?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */

public class Solution174 {
    public static int maxProfit(
            ArrayList<Integer> values,
            ArrayList<Integer> weights,
            int n, int w) {

        int[][] dp = new int[n][w + 1];
        Arrays.stream(dp).forEach(arr -> Arrays.fill(arr, -1));
        return maxProfit(values, weights, 0, n, w, dp);
    }

    public static int maxProfit(
            ArrayList<Integer> values,
            ArrayList<Integer> weights,
            int index,
            int n,
            int w,
            int[][] dp) {

        if (w <= 0 || index == n)
            return 0;

        if (dp[index][w] != -1)
            return dp[index][w];

        int pick = Integer.MIN_VALUE;
        if (weights.get(index) <= w) {
            pick = values.get(index) + maxProfit(values, weights, index + 1, n, w - weights.get(index), dp);
        }
        int notPick = maxProfit(values, weights, index + 1, n, w, dp);
        return dp[index][w] = Math.max(pick, notPick);
    }
}