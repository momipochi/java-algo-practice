package com.example.LeetCode.L200_NumberofIslands;

public class NumberofIslands {
    public int numIslands(char[][] grid) {
        int res = 0, row = grid.length, col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    fixGrid(i, j, row, col, grid);
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
        fixGrid(i, j + 1, maxI, maxJ, grid);
        fixGrid(i - 1, j, maxI, maxJ, grid);
        fixGrid(i, j - 1, maxI, maxJ, grid);
    }

}
