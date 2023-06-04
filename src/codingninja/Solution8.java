package codingninja;

import java.util.*;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/merge-intervals_8230700?challengeSlug=striver-sde-challenge]
 * @author: Pawan Maurya
 */
class Interval {
    int start, finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}
public class Solution8 {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        List<Interval> ans = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt((Interval i) -> i.start).thenComparingInt(i -> i.finish));

        Interval last = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (last.finish >= intervals[i].start) {
                if (last.finish < intervals[i].finish)
                    last.finish = intervals[i].finish;
            } else {
                ans.add(last);
                last = intervals[i];
            }
        }
        ans.add(last);
        return ans;
    }
}
