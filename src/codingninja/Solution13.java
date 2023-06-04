package codingninja;

import java.util.ArrayList;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/search-in-a-2d-matrix_8230773?challengeSlug=striver-sde-challenge]
 * @author: Pawan Maurya
 */

public class Solution13 {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {

        int n = mat.size();
        int m = mat.get(0).size();

        int low = 0;
        int high = (n * m) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;
            Integer num = mat.get(row).get(col);
            if (num == target)
                return true;
            else if (num < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
