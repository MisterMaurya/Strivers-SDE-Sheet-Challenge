package codingninja;

import java.util.ArrayList;

// https://www.codingninjas.com/studio/problems/single-element-in-a-sorted-array_8230826?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 63. Single Element in a Sorted Array
public class Solution63 {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int high = arr.size() - 1;
        int low = 0;

        if (arr.size() == 1)
            return arr.get(0);

        if (!arr.get(low).equals(arr.get(low + 1)))
            return arr.get(low);


        if (!arr.get(high).equals(arr.get(high - 1)))
            return arr.get(high);


        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (!arr.get(mid).equals(arr.get(mid + 1)) && !arr.get(mid).equals(arr.get(mid - 1))) {
                return arr.get(mid);
            }
            if (mid % 2 == 0 && arr.get(mid).equals(arr.get(mid + 1)) ||
                    mid % 2 != 0 && arr.get(mid).equals(arr.get(mid - 1))) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}