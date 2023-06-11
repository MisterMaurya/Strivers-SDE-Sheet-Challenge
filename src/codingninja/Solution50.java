package codingninja;

import java.util.ArrayList;
import java.util.Arrays;

// https://www.codingninjas.com/codestudio/problems/subsets-ii_8230855?challengeSlug=striver-sde-challenge
// 50. Subsets II
public class Solution50 {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        solve(ans, ds, arr, 0, n);
        return ans;
    }

    private static void solve(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds, int[] arr, int index, int n) {
        ans.add(new ArrayList<>(ds));
        for (int i = index; i < n; i++) {
            if (i != index && arr[i] == arr[i - 1]) continue;
            ds.add(arr[i]);
            solve(ans, ds, arr, i + 1, n);
            ds.remove(ds.size() - 1);

        }
    }
}