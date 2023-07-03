package codingninja;

import java.util.PriorityQueue;

// https://www.codingninjas.com/studio/problems/kth-largest-element-in-a-stream_8230728?challengeSlug=striver-sde-challenge
// 153. Kth Largest Element In A Stream
public class Kthlargest153 {

    PriorityQueue<Integer> pq;
    int size;

    Kthlargest153(int k, int[] arr) {
        pq = new PriorityQueue<>();
        size = k;
        for (int n : arr) {
            pq.add(n);
            if (pq.size() > k)
                pq.poll();
        }

    }

    void add(int n) {
        pq.add(n);
        if (pq.size() > size)
            pq.poll();
    }

    int getKthLargest() {
        return pq.peek();
    }
}
