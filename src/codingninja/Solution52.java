package codingninja;

import java.util.ArrayList;
import java.util.Collections;

// https://www.codingninjas.com/codestudio/problems/combination-sum-ii_8230820?challengeSlug=striver-sde-challenge
// 52. Combination Sum II


public class Solution52 {
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target) {
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        solve(ans, arr, ds, n, target, 0);
        return ans;
    }

    private static void solve(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> arr, ArrayList<Integer> ds, int n, int target, int index) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < n; i++) {
            if (i != index && arr.get(i) == arr.get(i - 1)) continue;
            Integer integer = arr.get(i);
            if (integer <= target) {
                ds.add(integer);
                solve(ans, arr, ds, n, target - integer, i + 1);
                ds.remove(ds.size() - 1);
            }
        }
    }
}