package com.example.LeetCode.L56_MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/merge-intervals/description/

/*
 * We first want to make sure that the intervals are sorted properly so that the 0th element
 * is the smallest. Before looping, we want to have a variables that constantly holds the value
 * of the previous element, starting from 0. For each element in the interval we want to check
 * if the prev element 1th index is greater than the current 0th index, if it is smaller, this naturally
 * means that the interval is too great, thus we cannot merge the interval and must add this
 * to the return collection and set the new prev variable to the current element. Otherwise we
 * simple modify the prev's 1th index to the the max(prev[1], interval[i][1]), and the  merging
 * is complete. At the end, out of the loop we add prev to the collection to and return it.
 */

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] prev = intervals[0];
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (prev[1] < intervals[i][0]) {
                res.add(prev);
                prev = intervals[i];
            } else {
                prev[1] = prev[1] < intervals[i][1] ? intervals[i][1] : prev[1];
            }
        }
        res.add(prev);
        return res.toArray(new int[res.size()][]);
    }
}
