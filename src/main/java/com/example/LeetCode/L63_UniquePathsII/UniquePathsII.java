package com.example.LeetCode.L63_UniquePathsII;

// https://leetcode.com/problems/unique-paths-ii/
public class UniquePathsII {
    int[][] dp;
    int[][] grid;

    public int uniquePathsWithObstaclesAlternate(int[][] obstacleGrid) {
        grid = obstacleGrid;
        dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        return helper(grid.length - 1, grid[0].length - 1);
    }

    private int helper(int x, int y) {
        if (x < 0 || y < 0 || grid[x][y] == 1) {
            return 0;
        }
        if (x == 0 && y == 0) {
            return 1;
        }
        if (dp[x][y] != 0) {
            return dp[x][y];
        }
        return dp[x][y] = helper(x - 1, y) + helper(x, y - 1);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (obstacleGrid[i][j] == 0) {
                    if (i == 0 && j == 0) {
                        dp[i][j] = 1;
                        continue;
                    }
                    if (i > 0) {
                        dp[i][j] += dp[i - 1][j];
                    }
                    if (j > 0) {
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
        }
        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
