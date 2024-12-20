package com.example.LeetCode.L64_MinPathSum;

// https://leetcode.com/problems/minimum-path-sum/description/

/*
 * THe algorithm uses tabulation. Naturally, this usually means you need additional
 * row or col. For this case we want to start iterating from the end so we start from
 * the grid.length - 1 rather than our tabulation's length to compensate for the 
 * additional size. If our indexes both reach 0 we can simply return the element
 * on grid at that index. If the indexs are lower than 0, we return Integer.MaxValue.
 * If the element in the tab at index is not 0, we return that element.
 * In the end, we assign the current tab element to current grid element plus
 * the smaller value from the next row or col, from the recursive call.
 */

public class MinPathSum {
    int[][] dp;
    int[][] grid;

    public int minPathSum(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        this.grid = grid;
        return helper(grid.length - 1, grid[0].length - 1);
    }

    private int helper(int x, int y) {
        if (x == 0 && y == 0) {
            return grid[0][0];
        }
        if (x < 0 || y < 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[x][y] != 0) {
            return dp[x][y];
        }
        return dp[x][y] = grid[x][y] + Math.min(helper(x - 1, y), helper(x, y - 1));
    }

    public int minPathSumFromZero(int[][] grid) {
        int dp[][] = new int[grid.length + 1][grid[0].length + 1];
        return sum(grid, 0, 0, dp);
    }

    public int sum(int arr[][], int i, int j, int dp[][]) {
        if (i >= arr.length || j >= arr[0].length) {
            return Integer.MAX_VALUE;
        }
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            return arr[i][j];
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        return dp[i][j] = arr[i][j] + Math.min(sum(arr, i, j + 1, dp), sum(arr, i + 1, j, dp));
    }

    public int minPathIterative(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j] + grid[i][j], dp[i][j - 1] + grid[i][j]);
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }
}
