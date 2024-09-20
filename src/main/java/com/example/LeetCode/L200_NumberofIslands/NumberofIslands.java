package com.example.LeetCode.L200_NumberofIslands;

// https://leetcode.com/problems/number-of-islands/description/

/*
 * The idea is to find 1 and recersively replace the element at index [i][j] to 0,
 * this will help prevent visiting previously visited indexes. We just need to find
 * 1 once to increment the counter.
 */

public class NumberofIslands {
    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    modifyIsland(i, j, grid);
                }
            }
        }
        return res;
    }

    private void modifyIsland(int x, int y, char[][] grid) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';
        modifyIsland(x + 1, y, grid);
        modifyIsland(x, y + 1, grid);
        modifyIsland(x, y - 1, grid);
        modifyIsland(x - 1, y, grid);
    }

}
