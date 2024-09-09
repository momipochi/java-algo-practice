package com.example.LeetCode.L494_TargetSum;

// https://leetcode.com/problems/target-sum/description/

/*
 * The most optimized way is to use tabulation to get the answer. 
 */

public class TargetSum {
    private int[] dp;

    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        target = Math.abs(target);
        if ((total + target) % 2 == 1) {
            return 0;
        }
        // new target sum for s1
        int s1 = (target + total) / 2;
        dp = new int[s1 + 1];
        dp[0] = 1;
        evaluate(nums, 0, s1);
        return dp[s1];
    }

    private void evaluate(int[] nums, int i, int target) {
        if (i == nums.length) {
            return;
        }
        for (int n = target; n >= nums[i]; n--) {
            dp[n] = dp[n] + dp[n - nums[i]];
        }
        evaluate(nums, i + 1, target);
    }
}
