package com.example.LeetCode.L329_LongestIncreasingPathInMatrix;

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
            for (int j = 0; j < matrix[0].length; j++) {
                res = Math.max(dfs(matrix, i, j, Integer.MIN_VALUE), res);
            }
        }

        return res;
    }

    public int dfs(int[][] matrix, int i, int j, int prevVal) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] <= prevVal) {
            return 0;
        }

        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int temp = 0;
        int curr = matrix[i][j];
        temp = Math.max(temp, dfs(matrix, i + 1, j, curr));
        temp = Math.max(temp, dfs(matrix, i - 1, j, curr));
        temp = Math.max(temp, dfs(matrix, i, j + 1, curr));
        temp = Math.max(temp, dfs(matrix, i, j - 1, curr));

        return dp[i][j] = ++temp;
    }
}
