package com.example.LeetCode.L695_MaxAreaOfIsland;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length, col = grid[0].length, max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, helper(i, j, row, col, grid));
                }
            }
        }
        return max;
    }

    public int helper(int i, int j, int maxI, int maxJ, int[][] grid) {
        if (i < 0 || j < 0 || i >= maxI || j >= maxJ || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;

        int res = 1;
        res+=helper(i+1, j, maxI, maxJ, grid);
        res+=helper(i-1, j, maxI, maxJ, grid);
        res+=helper(i, j+1, maxI, maxJ, grid);
        res+=helper(i, j-1, maxI, maxJ, grid);

        return res;
    }
}
