package com.example.LeetCode.L329_LongestIncreasingPathInMatrix;

// https://leetcode.com/problems/longest-increasing-path-in-a-matrix/description/
public class LongestIncreasingPathInMatrix {
    public int longestIncreasingPathNaive(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int tmp = maxPathNaive(i, j, 0, Integer.MIN_VALUE, matrix,
                        new boolean[matrix.length][matrix[0].length]);
                max = Math.max(max, tmp);
            }
        }
        return max;
    }

    private int maxPathNaive(int x, int y, int path, int prev, int[][] matrix, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length || visited[x][y] || prev >= matrix[x][y]) {
            return path;
        }
        visited[x][y] = true;
        path++;
        int tmp = path, curr = matrix[x][y];
        tmp = Math.max(tmp, maxPathNaive(x + 1, y, path, curr, matrix, visited));
        tmp = Math.max(tmp, maxPathNaive(x - 1, y, path, curr, matrix, visited));
        tmp = Math.max(tmp, maxPathNaive(x, y + 1, path, curr, matrix, visited));
        tmp = Math.max(tmp, maxPathNaive(x, y - 1, path, curr, matrix, visited));
        visited[x][y] = false;
        return tmp;

    }

    int[][] dp;

    public int longestIncreasingPath(int[][] matrix) {
        dp = new int[matrix.length + 1][matrix[0].length + 1];
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res = Math.max(dfs(i, j, Integer.MIN_VALUE, matrix), res);
            }
        }
        return res;
    }

    private int dfs(int x, int y, int prev, int[][] matrix) {
        if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length || prev >= matrix[x][y]) {
            return 0;
        }
        if (dp[x][y] != 0) {
            return dp[x][y];
        }

        int tmp = 0;
        int curr = matrix[x][y];
        tmp = Math.max(dfs(x + 1, y, curr, matrix), tmp);
        tmp = Math.max(dfs(x - 1, y, curr, matrix), tmp);
        tmp = Math.max(dfs(x, y + 1, curr, matrix), tmp);
        tmp = Math.max(dfs(x, y - 1, curr, matrix), tmp);

        return dp[x][y] = ++tmp;
    }
}
