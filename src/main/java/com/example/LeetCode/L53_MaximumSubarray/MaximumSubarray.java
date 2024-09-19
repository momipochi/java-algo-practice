package com.example.LeetCode.L53_MaximumSubarray;

// https://leetcode.com/problems/maximum-subarray/

/*
 * We want to be able to add up our sum, in order to do that, we need to 
 * ideally start adding from 0. As for the loop, we want to start from 1
 * because we need to check the first if the 0th index is valid.
 * All we need to do now is to check if the variable holding the sum
 * is lower than 0 or not, if so we restart adding from 0. And for every
 * loop we check if the current sum is greater than the previous one and replace it if it is.
 */

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            max = sum > max ? sum : max;
        }
        return max;
    }
}
