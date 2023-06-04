package codingninja;


/**
 * @description: [https://www.codingninjas.com/codestudio/problems/merge-two-sorted-arrays_8230835?challengeSlug=striver-sde-challenge&leftPanelTab=1]
 * @author: Pawan Maurya
 */
public class Solution9 {
    public static int[] ninjaAndSortedArrays(int[] arr1, int[] arr2, int m, int n) {

        int k = arr1.length - 1;
        m = m - 1;
        n = n - 1;

        while (m >= 0 && n >= 0) {
            if (arr1[m] >= arr2[n]) {
                arr1[k--] = arr1[m--];
            } else {
                arr1[k--] = arr2[n--];
            }
        }

        while (m >= 0) {
            arr1[k--] = arr1[m--];
        }

        while (n >= 0) {
            arr1[k--] = arr2[n--];
        }
        return arr1;
    }
}
