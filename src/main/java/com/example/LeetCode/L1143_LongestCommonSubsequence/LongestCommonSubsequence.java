package com.example.LeetCode.L1143_LongestCommonSubsequence;

// https://leetcode.com/problems/longest-common-subsequence/
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(), m = text2.length();
        int[][] dpGrid = new int[n + 1][m + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dpGrid[i][j] = dpGrid[i + 1][j + 1] + 1;
                } else {
                    dpGrid[i][j] = Math.max(dpGrid[i + 1][j], dpGrid[i][j + 1]);
                }
            }
        }
        return dpGrid[0][0];
    }

}
