package com.example.LeetCode.L695_MaxAreaOfIsland;

// https://leetcode.com/problems/max-area-of-island/description/

/*
 * The idea of the algorithm for this task is to iterate through the grid to find the first 1 in the array
 * once we find it, we check its neighbours while also changing the current index element to 0,
 * this way we can, by design, prevent encountering the same 1s again.
 * 
 * All that needs to be done afterwards is to check for the previous maximum with the current maximum.
 */

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, operate(i, j, grid));
                }
            }
        }
        return max;
    }

    private int operate(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        return 1 + operate(i + 1, j, grid) + operate(i - 1, j, grid) + operate(i, j + 1, grid)
                + operate(i, j - 1, grid);
    }
}
