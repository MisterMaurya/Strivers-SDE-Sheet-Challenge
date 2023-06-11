package codingninja;

import java.util.ArrayList;
import java.util.Collections;

// https://www.codingninjas.com/codestudio/problems/subset-sum_8230859?challengeSlug=striver-sde-challenge
// 49. Subset Sum
public class Solution49 {
    public static ArrayList<Integer> subsetSum(int[] num) {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(ans, num, 0, num.length, 0);
        Collections.sort(ans);
        return ans;
    }

    private static void solve(ArrayList<Integer> ans, int[] num, int index, int length, int currSum) {
        if (index >= length) {
            ans.add(currSum);
            return;
        }
        solve(ans, num, index + 1, length, currSum);
        solve(ans, num, index + 1, length, currSum + num[index]);
    }

}