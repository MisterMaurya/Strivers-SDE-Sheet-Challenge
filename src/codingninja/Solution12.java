package codingninja;

// https://www.codingninjas.com/codestudio/problems/count-inversions_8230680?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 12. Count Inversions
class Solution12 {

    public static long getInversions(long[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        return mergeSort(left, right, arr);
    }

    private static long mergeSort(int left, int right, long[] arr) {
        int count = 0;
        if (left >= right)
            return count;
        int mid = left + (right - left) / 2;
        count += mergeSort(left, mid, arr);
        count += mergeSort(mid + 1, right, arr);
        count += merge(left, mid, right, arr);
        return count;

    }

    private static long merge(int left, int mid, int right, long[] arr) {

        int i = left;
        int j = mid + 1;

        long[] temp = new long[right + 1];
        int k = 0;
        long count = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                count += (1 + mid - i);
                temp[k++] = arr[j++];
            }
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        k = 0;

        for (int x = left; x <= right; x++) {
            arr[x] = temp[k++];
        }
        return count;
    }
}