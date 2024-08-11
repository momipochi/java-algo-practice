package com.example.LeetCode.L200_NumberofIslands;

public class NumberofIslands {
    public int numIslands(char[][] grid) {
        int rowCount = grid.length;
        int colCount = grid[0].length;
        int islands = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    islandSearch(grid, i, j, rowCount, colCount);
                }
            }
        }
        return islands;
    }

    private void islandSearch(char[][] grid, int i, int j, int rowCount, int colCount) {
        if (i < 0 || i >= rowCount || j < 0 || j >= colCount || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        islandSearch(grid, i + 1, j, rowCount, colCount);
        islandSearch(grid, i - 1, j, rowCount, colCount);
        islandSearch(grid, i, j + 1, rowCount, colCount);
        islandSearch(grid, i, j - 1, rowCount, colCount);
    }
}
