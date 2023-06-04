package codingninja;

import java.util.ArrayList;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/next-permutation_8230741?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */


public class Solution3 {

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {

        int index = -1;
        int n = permutation.size() - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverse(permutation, 0, n);
            return permutation;
        }

        for (int i = n; i > index; i--) {
            if (permutation.get(i) > permutation.get(index)) {
                int temp = permutation.get(i);
                permutation.set(i, permutation.get(index));
                permutation.set(index, temp);
                break;
            }
        }
        reverse(permutation, index + 1, n);
        return permutation;
    }

    public static void reverse(ArrayList<Integer> permutation, int i, int j) {
        while (i <= j) {
            int temp = permutation.get(i);
            permutation.set(i, permutation.get(j));
            permutation.set(j, temp);
            i++;
            j--;
        }
    }

}