package com.example.LeetCode.L56_MergeIntervals;

import java.util.Arrays;
import java.util.Stack;

// https://leetcode.com/problems/merge-intervals/description/
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] prev = intervals[0];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < intervals.length; i++) {
            if (prev[1] < intervals[i][0]) {
                stack.add(prev);
                prev = intervals[i];
            } else {
                prev[1] = Math.max(prev[1], intervals[i][1]);
            }
        }
        stack.add(prev);
        return stack.toArray(new int[stack.size()][]);
    }
}
