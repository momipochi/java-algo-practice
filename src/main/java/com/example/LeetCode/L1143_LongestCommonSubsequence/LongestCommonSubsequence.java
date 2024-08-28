package com.example.LeetCode.L1143_LongestCommonSubsequence;

// https://leetcode.com/problems/longest-common-subsequence/

/*
 * The idea is that, by using a grid we can create a history of every index, each of these indexes can also
 * be used to refer back to the position of the strings. Looping from the end to 0 inclusive.
 * 
 * All we have to do is to check if the character and the given indexs are the same, if so we can go diagonoally,
 * otherwise we need to check whether going up or left returns a greater value.
 * In the end the answer would be carried to [0][0].
 * 
 * We just need to make sure to have the grid to be 1 row and col larger to compensate for a starting point.
 * You should also consider declaring variables holding the length of the strings.
 * 
 * Tip: it is faster to convert string to char array and getting the element by index than using string charAt method
 */

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int l = text1.length(), r = text2.length();
        char[] t1 = text1.toCharArray(), t2 = text2.toCharArray();
        int[][] grid = new int[l + 1][r + 1];
        for (int i = l - 1; i >= 0; i--) {
            for (int j = r - 1; j >= 0; j--) {
                if (t1[i] == t2[j]) {
                    grid[i][j] = grid[i + 1][j + 1] + 1;
                } else {
                    grid[i][j] = Math.max(grid[i + 1][j], grid[i][j + 1]);
                }
            }
        }
        return grid[0][0];
    }

}
