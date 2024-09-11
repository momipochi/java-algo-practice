package com.example.LeetCode.L329_LongestIncreasingPathInMatrix;

// https://leetcode.com/problems/longest-increasing-path-in-a-matrix/description/
/*
  * The best way is to use tabulation in this case, meaning we need a collection
  * that is 1 size larger than the matrix.
  * With that collection, we simply need to increment each index and return it.
  * Since we want to get the LONGEST increasing path, this means that the
  * function most likely needs to return a value
  * for us to pick between the current and the previous. By the nature of the
  * task, there is no way to loop around on itself
  * because by the time you loop around, the previous numbers would be too small
  * so they won't be picked. That being said,
  * we still need to prevent going backwards, otherwise the function would be
  * stuck in an infinite loop. Therefore it is
  * necessary to check if the previous value matches our condition, aka is it
  * greater or not.
  * If the current index element on the tabulation collection is not 0 we can also return the current index element.
  */

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
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = Math.max(max, dfs(i, j, Integer.MIN_VALUE, matrix));
            }
        }
        return max;
    }

    private int dfs(int x, int y, int prev, int[][] matrix) {
        if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[x].length || prev >= matrix[x][y]) {
            return 0;
        }
        if (dp[x][y] != 0) {
            return dp[x][y];
        }
        int curr = matrix[x][y], count = 0;

        count = Math.max(dfs(x + 1, y, curr, matrix), count);
        count = Math.max(dfs(x, y + 1, curr, matrix), count);
        count = Math.max(dfs(x - 1, y, curr, matrix), count);
        count = Math.max(dfs(x, y - 1, curr, matrix), count);

        return dp[x][y] = ++count;
    }
}
