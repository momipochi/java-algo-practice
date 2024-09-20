package com.example.LeetCode.L79_wordsearch;

// https://leetcode.com/problems/word-search/description/

// Given an m x n grid of characters board and a string word, return true if word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
public class WordSearch {
    char[] wordArr;

    public boolean exist(char[][] board, String word) {
        wordArr = word.toCharArray();
        boolean[][] used = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == wordArr[0] && solution(i, j, 0, board, used)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean solution(int x, int y, int charIndex, char[][] board, boolean[][] used) {
        if (charIndex == wordArr.length) {
            return true;
        }
        if (x < 0 || y < 0 || x >= board.length || y >= board[x].length || used[x][y]
                || board[x][y] != wordArr[charIndex]) {
            return false;
        }
        used[x][y] = true;
        boolean res = solution(x + 1, y, charIndex + 1, board, used) ||
                solution(x, y + 1, charIndex + 1, board, used) ||
                solution(x, y - 1, charIndex + 1, board, used) ||
                solution(x - 1, y, charIndex + 1, board, used);

        used[x][y] = false;
        return res;
    }

}
