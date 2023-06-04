package codingninja;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/**
 * @description: [https://www.codingninjas.com/codestudio/problems/word-break-ii_8230786?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */
public class Solution60 {

    public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
        ArrayList<String> ds = new ArrayList<>();
        solve(s, new HashSet<>(dictionary), 0, ds, s.length(), "");
        return ds;
    }

    private static void solve(String s, HashSet<String> dictionary, int index, List<String> ds, int length, String s1) {
        if (index >= length) {
            ds.add(s1);
        }
        for (int j = index; j < length; j++) {
            String word = s.substring(index, j + 1);
            if (dictionary.contains(word)) {
                String temp;
                if (s1.length() == 0) {
                    temp = word;
                } else {
                    temp = s1 + " " + word;
                }
                solve(s, dictionary, index + word.length(), ds, length, temp);
            }
        }
    }

}