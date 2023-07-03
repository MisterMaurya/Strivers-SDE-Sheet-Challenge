package codingninja;

import java.util.*;
import java.io.*;

// https://www.codingninjas.com/studio/problems/count-distinct-element-in-every-k-size-window_8230749?challengeSlug=striver-sde-challenge&leftPanelTab=0
// 154. Count Distinct Element in Every K Size Window
public class Solution154 {

    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;

        while (j < arr.size()) {
            map.put(arr.get(j), map.getOrDefault(arr.get(j), 0) + 1);
            if (j - i + 1 == k) {
                ans.add(map.size());
            } else if (j - i + 1 >= k) {
                Integer val = map.get(arr.get(i));
                if (val == 1)
                    map.remove(arr.get(i));
                else {
                    map.put(arr.get(i), val - 1);
                }
                i++;
                ans.add(Math.min(map.size(), k));
            }
            j++;
        }
        return ans;

    }
}
