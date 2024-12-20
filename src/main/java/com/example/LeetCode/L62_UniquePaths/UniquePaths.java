package com.example.LeetCode.L62_UniquePaths;

import java.util.Arrays;

// https://leetcode.com/problems/unique-paths/description/
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] is : dp) {
            Arrays.fill(is, 1);
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
