package codingninja;

import java.util.ArrayList;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/pascal-s-triangle_8230805?challengeSlug=striver-sde-challenge&leftPanelTab=2]
 * @author: Pawan Maurya
 */

public class Solution2 {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Long> inner = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    inner.add(1L);
                } else {
                    inner.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(inner);
        }

        return ans;
    }
}
