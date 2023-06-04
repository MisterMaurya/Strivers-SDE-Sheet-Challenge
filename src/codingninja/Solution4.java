package codingninja;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/maximum-subarray-sum_8230694?challengeSlug=striver-sde-challenge]
 * @author: Pawan Maurya
 */

public class Solution4 {

    public static long maxSubarraySum(int[] arr, int n) {
        long max = arr[0];
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            max = Math.max(currentSum, max);
            if (currentSum < 0)
                currentSum = 0;
        }
        return max < 0 ? 0 : max;
    }

}
