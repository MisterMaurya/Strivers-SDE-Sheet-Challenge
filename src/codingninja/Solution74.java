package codingninja;

import java.util.*;
import java.io.*;
import java.util.ArrayList;

// https://www.codingninjas.com/codestudio/problems/merge-k-sorted-arrays_8230770?challengeSlug=striver-sde-challenge
// 74. Merge K Sorted Arrays
public class Solution74 {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k) {

        ArrayList<Integer> l1 = kArrays.get(0);
        for (int i = 1; i < k; i++) {
            ArrayList<Integer> l2 = kArrays.get(i);
            l1 = mergeTwoList(l1, l2);
        }
        return l1;
    }


    static ArrayList<Integer> mergeTwoList(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> integers = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)) {
                integers.add(l1.get(i));
                i++;
            } else {
                integers.add(l2.get(j));
                j++;
            }
        }

        while (i < l1.size()) {
            integers.add(l1.get(i));
            i++;
        }

        while (j < l2.size()) {
            integers.add(l2.get(j));
            j++;
        }
        return integers;
    }


}
