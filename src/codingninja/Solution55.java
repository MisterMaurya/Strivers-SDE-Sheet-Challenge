package codingninja;

import java.util.ArrayList;
import java.util.List;

//  55. Day 13 : Print Permutations - String
// https://www.codingninjas.com/codestudio/problems/day-13-print-permutations-string_8230703?challengeSlug=striver-sde-challenge
public class Solution55 {
    public static List<String> findPermutations(String s) {
        int n = s.length();
        char[] ds = s.toCharArray();
        List<String> ans = new ArrayList<>();
        solve(0, n, ds, s, ans);
        return ans;
    }

    public static void solve(int index, int n, char[] ds, String s, List<String> ans) {
        if (index >= n) {
            ans.add(new String(ds));
            return;
        }
        for (int i = index; i < n; i++) {
            swap(ds, i, index);
            solve(index + 1, n, ds, s, ans);
            swap(ds, i, index);
        }
    }

    static void swap(char[] ds, int i, int j) {
        char temp = ds[i];
        ds[i] = ds[j];
        ds[j] = temp;
    }
}