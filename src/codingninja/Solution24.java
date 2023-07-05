package codingninja;

import java.util.*;
import java.io.*;


// https://www.codingninjas.com/studio/problems/longest-substring-without-repeating-characters_8230684?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 24. Longest Substring Without Repeating Characters
public class Solution24 {
    public static int uniqueSubstrings(String s) {
        int max = 0;

        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (set.add(s.charAt(j))) {
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i));
                i++;
                continue;
            }
            j++;
        }
        return max;
    }
}
