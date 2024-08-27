package com.example.LeetCode.L695_MaxAreaOfIsland;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, solution(i, j, 0, grid));
                }
            }
        }
        return max;
    }

    private int solution(int i, int j, int sum, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
            return sum;
        }
        grid[i][j] = 0;
        int tmp = sum + 1;
        tmp = Math.max(tmp, solution(i + 1, j, tmp, grid));
        tmp = Math.max(tmp, solution(i - 1, j, tmp, grid));
        tmp = Math.max(tmp, solution(i, j + 1, tmp, grid));
        tmp = Math.max(tmp, solution(i, j - 1, tmp, grid));
        return tmp;
    }
}
