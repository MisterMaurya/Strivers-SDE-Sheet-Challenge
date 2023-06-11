package codingninja;

import java.util.ArrayList;
// https://www.codingninjas.com/codestudio/problems/remove-duplicates-from-sorted-array_8230811?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 41. Remove Duplicates from Sorted Array
public class Solution41 {
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        int i = 0;
        int j = i + 1;

        while (j < n) {
            if (arr.get(j) > arr.get(i)) {
                arr.set(i + 1, arr.get(j));
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i + 1;
    }
}