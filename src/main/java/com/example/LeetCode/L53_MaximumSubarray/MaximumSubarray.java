package com.example.LeetCode.L53_MaximumSubarray;

// https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int max = nums[0], sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
