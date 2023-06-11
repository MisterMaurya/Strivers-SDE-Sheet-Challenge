package codingninja;

// https://www.codingninjas.com/codestudio/problems/longest-increasing-subsequence_8230689?challengeSlug=striver-sde-challenge
public class Solution172 {

    private static int findLowerBound(int[] a, int l, int h, int item) {
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (item > a[mid]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }

    public static int longestIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        int ans = 0;

        for (int j : arr) {
            int pos = findLowerBound(dp, 0, ans, j);
            dp[pos] = j;
            if (pos == ans) {
                ans++;
            }
        }
        return ans;
    }

}