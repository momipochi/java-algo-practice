package com.example.LeetCode.L1143_LongestCommonSubsequence;

// https://leetcode.com/problems/longest-common-subsequence/
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int t1 = text1.length(), t2 = text2.length();
        int[][] grid = new int[t1 + 1][t2 + 1];

        for (int i = t1 - 1; i >= 0; i--) {
            for (int j = t2 - 1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    grid[i][j] = grid[i + 1][j + 1] + 1;
                } else {
                    grid[i][j] = Math.max(grid[i + 1][j], grid[i][j + 1]);
                }
            }
        }
        return grid[0][0];
    }

}
