package com.example.LeetCode.L931_MinimumFallingPathSum;

import java.util.Arrays;

public class MinimumFallingPathSum {
    int[][] matrix;
    int[][] dp;

    public int minFallingPathSum(int[][] matrix) {
        this.matrix = matrix;
        dp = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            min = Math.min(min, findPath(0, i));
        }
        return min;
    }

    private int findPath(int x, int y) {
        if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length) {
            return Integer.MAX_VALUE;
        }

        if (x == matrix.length - 1) {
            return matrix[x][y];

        }
        if (dp[x][y] != Integer.MIN_VALUE) {
            return dp[x][y];
        }

        return dp[x][y] = matrix[x][y] + Math.min(findPath(x + 1, y + 1),
                Math.min(findPath(x + 1, y - 1), findPath(x + 1, y)));
    }
}
