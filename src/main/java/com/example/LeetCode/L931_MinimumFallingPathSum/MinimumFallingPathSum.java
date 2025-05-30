package com.example.LeetCode.L931_MinimumFallingPathSum;

public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = matrix[0][i];
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int m = matrix[i][j];
                int min = m + dp[i - 1][j];
                if (j - 1 >= 0) {
                    min = Math.min(min, m + dp[i - 1][j - 1]);
                }
                if (j + 1 < matrix[i].length) {
                    min = Math.min(min, m + dp[i - 1][j + 1]);
                }
                dp[i][j] = min;
            }
        }
        int min = dp[dp.length - 1][0];
        for (int i = 0; i < dp[0].length; i++) {
            min = Math.min(min, dp[dp.length - 1][i]);
        }
        return min;
    }
}
