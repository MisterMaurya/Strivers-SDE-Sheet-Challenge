package codingninja;

import java.util.HashSet;
import java.util.Set;

// https://www.codingninjas.com/codestudio/problems/longest-consecutive-sequence_8230708?challengeSlug=striver-sde-challenge
//  21. Longest Consecutive Sequence
public class Solution21 {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int max = 0;
        for (int n : arr) {
            if (!set.contains(n - 1)) {
                int curr = 1;
                int temp = n;
                while (set.contains(temp + 1)) {
                    temp = temp + 1;
                    curr++;
                }
                max = Math.max(curr, max);
            }
        }
        return max;
    }
}