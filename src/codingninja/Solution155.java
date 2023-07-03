package codingninja;

import java.util.*;
import java.io.*;

// https://www.codingninjas.com/studio/problems/kth-largest-element-in-the-unsorted-array_8230740?challengeSlug=striver-sde-challenge
// 155. Kth largest element in the unsorted array
public class Solution155 {

    static int kthLargest(ArrayList<Integer> arr, int size, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : arr) {
            pq.add(n);
            if (pq.size() > K) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
