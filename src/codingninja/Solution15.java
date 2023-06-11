package codingninja;

// 15. Day 6 : Majority element
// https://www.codingninjas.com/codestudio/problems/day-6-majority-element_8230731?challengeSlug=striver-sde-challenge
public class Solution15 {
    public static int findMajority(int[] arr, int n) {

        int majorityElement = -1;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                majorityElement = num;
                count++;
            } else if (majorityElement == num)
                count++;
            else
                count--;
        }

        int req = n / 2;
        int countM = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == majorityElement) {
                countM++;
            }
        }
        return countM > req ? majorityElement : -1;
    }
}