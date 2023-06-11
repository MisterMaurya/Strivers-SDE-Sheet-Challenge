package codingninja;

import java.util.*;

//https://www.codingninjas.com/codestudio/problems/kth-smallest-and-largest-element-of-array_8230829?challengeSlug=striver-sde-challenge&leftPanelTab=1
//70. Kth Smallest and Largest Element of Array
public class Solution70 {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(arr);

        int smallest = -1;
        int largest = -1;

        for (int i = 0; i < n && k > 0; i++) {
            smallest = arr.get(i);
            largest = arr.get(n - i - 1);
            k--;
        }

        ans.add(smallest);
        ans.add(largest);
        return ans;
    }
}
