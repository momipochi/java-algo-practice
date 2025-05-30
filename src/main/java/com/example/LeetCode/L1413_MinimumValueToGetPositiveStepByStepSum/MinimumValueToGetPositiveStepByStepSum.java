package com.example.LeetCode.L1413_MinimumValueToGetPositiveStepByStepSum;

public class MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int sum = 0, min = 0;
        for (int n : nums) {
            sum += n;
            min = Math.min(sum, min);
        }
        return -min + 1;
    }
}
