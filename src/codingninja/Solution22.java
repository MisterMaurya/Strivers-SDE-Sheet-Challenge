package codingninja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// https://www.codingninjas.com/studio/problems/longest-subarray-zero-sum_8230747?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 22.Longest Subarray Zero Sum
public class Solution22 {

    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

        int prefixSum = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.size(); i++) {
            prefixSum += arr.get(i);
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            } else {
                int index = map.get(prefixSum);
                ans = Math.max(i - index, ans);
            }
        }
        return ans;
    }
}