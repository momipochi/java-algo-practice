package com.example.LeetCode.L200_NumberofIslands;

// https://leetcode.com/problems/number-of-islands/description/

/*
 * The idea is to find 1 and recersively replace the element at index [i][j] to 0,
 * this will help prevent visiting previously visited indexes. We just need to find
 * 1 once to increment the counter.
 */

public class NumberofIslands {
    public int numIslands(char[][] grid) {
        int res = 0, row = grid.length, col = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    fixGrid(i, j, row, col, grid);
                    res++;
                }
            }
        }
        return res;
    }

    private void fixGrid(int i, int j, int maxI, int maxJ, char[][] grid) {
        if (i < 0 || j < 0 || i >= maxI || j >= maxJ || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        fixGrid(i + 1, j, maxI, maxJ, grid);
        fixGrid(i - 1, j, maxI, maxJ, grid);
        fixGrid(i, j + 1, maxI, maxJ, grid);
        fixGrid(i, j - 1, maxI, maxJ, grid);
    }

}
