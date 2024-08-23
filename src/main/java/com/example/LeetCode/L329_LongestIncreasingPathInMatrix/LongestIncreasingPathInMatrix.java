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
}
