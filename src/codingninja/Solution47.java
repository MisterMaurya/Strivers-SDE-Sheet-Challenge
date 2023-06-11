package codingninja;

// https://www.codingninjas.com/codestudio/problems/find-minimum-number-of-coins_8230766?challengeSlug=striver-sde-challenge
// 47. Find Minimum Number Of Coins
public class Solution47 {
    public static int findMinimumCoins(int amount) {
        int[] arr = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int i = 0;
        while (amount > 0 && i < arr.length) {
            if (amount >= arr[i]) {
                int coins = amount / arr[i];
                count += coins;
                amount -= coins * arr[i];
            }
            i++;

        }
        return count;
    }
}
