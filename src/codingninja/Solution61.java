package codingninja;

// https://www.codingninjas.com/studio/problems/find-nth-root-of-m_8230799?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 61.Find Nth Root Of M
public class Solution61 {
    public static int NthRoot(int n, int m) {

        int low = 1;
        int high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int temp = pow(mid, n);
            if (temp == m) return mid;

            if (temp > m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static int pow(int base, int power) {
        return (int) Math.pow(base, power);
    }
}
