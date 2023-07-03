package codingninja;

import java.util.*;
import java.io.*;

// https://www.codingninjas.com/studio/problems/k-most-frequent-elements_8230853?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 74. K Most Frequent Elements
public class Solution74_ {

    public static int[] KMostFrequent(int n, int k, int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int m : arr) {
            map.put(m, map.getOrDefault(m, 0) + 1);
        }

        int[] ans = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.feq - y.feq);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int ele = entry.getKey();
            int feq = entry.getValue();
            pq.add(new Pair(feq, ele));

            if (pq.size() > k)
                pq.poll();
        }

        int x = 0;
        while (!pq.isEmpty()) {
            ans[x++] = pq.poll().ele;
        }

        return ans;

    }

}

class Pair {
    int feq;
    int ele;

    Pair(int feq, int ele) {
        this.feq = feq;
        this.ele = ele;
    }
}

