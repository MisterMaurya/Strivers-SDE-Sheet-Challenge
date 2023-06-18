package codingninja;

// https://www.codingninjas.com/codestudio/problems/search-in-rotated-sorted-array_8230687?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 64. Search In Rotated Sorted Array

public class Solution64 {
    public static int search(int[] arr, int key) {

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return mid;

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= key && arr[mid] >= key) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= key && arr[high] >= key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}