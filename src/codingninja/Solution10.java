package codingninja;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//  10. Find Duplicate in Array
// https://www.codingninjas.com/codestudio/problems/find-duplicate-in-array_8230816?challengeSlug=striver-sde-challenge

public class Solution10 {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num))
                return num;
        }
        return -1;
    }
}
