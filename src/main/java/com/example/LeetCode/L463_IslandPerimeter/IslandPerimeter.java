package com.example.LeetCode.L463_IslandPerimeter;

// https://leetcode.com/problems/island-perimeter/description/

/*
 * For every 1 encountered is an island, check additionally [row+1][col] and [row][col+1] for neighbors,
 * in the end caculate it by island*4-neighbours*2
 */

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int island = 0, neighbors = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    island++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        neighbors++;
                    }
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        neighbors++;
                    }
                }
            }
        }
        return island * 4 - neighbors * 2;
    }
}
