package com.example.LeetCode.L52_NQueensII;

// https://leetcode.com/problems/n-queens-ii/description/
public class NQueensII {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '.';
            }
        }
        int[] rowCheck = new int[n];
        int[] diagBelow = new int[2 * n + 1];
        int[] diagAbove = new int[2 * n + 1];
        return backtrack(0, n, board, rowCheck, diagBelow, diagAbove);
    }

    private int backtrack(int col, int n, char[][] board, int[] rowCheck, int[] diagBelow, int[] diagAbove) {
        if (col == n) {
            return 1;
        }
        int count = 0;
        for (int row = 0; row < n; row++) {
            if (rowCheck[row] == 0 && diagBelow[row + col] == 0 && diagAbove[row - col + (n - 1)] == 0) {
                rowCheck[row] = 1;
                diagBelow[row + col] = 1;
                diagAbove[(row - col + (n - 1))] = 1;
                board[row][col] = 'Q';
                count += backtrack(col + 1, n, board, rowCheck, diagBelow, diagAbove);
                rowCheck[row] = 0;
                diagBelow[row + col] = 0;
                diagAbove[(row - col + (n - 1))] = 0;
                board[row][col] = '.';
            }
        }
        return count;
    }
}
