package com.example.LeetCode.L200_NumberofIslands;

// https://leetcode.com/problems/number-of-islands/description/

/*
 * The idea is to find 1 and recersively replace the element at index [i][j] to 0,
 * this will help prevent visiting previously visited indexes. We just need to find
 * 1 once to increment the counter.
 */

public class NumberofIslands {
    char[][] grid;

    public int numIslands(char[][] grid) {
        int res = 0;
        this.grid = grid;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    rec(i, j);
                }
            }
        }
        return res;
    }

    private void rec(int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] != '1') {
            return;
        }
        grid[x][y] = '0';
        rec(x + 1, y);
        rec(x - 1, y);
        rec(x, y + 1);
        rec(x, y - 1);
    }

}
