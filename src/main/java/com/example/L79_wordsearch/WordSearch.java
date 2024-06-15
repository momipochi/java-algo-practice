package com.example.L79_wordsearch;

// https://leetcode.com/problems/word-search/description/

// Given an m x n grid of characters board and a string word, return true if word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && recur(board, word, used, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean recur(char[][] board, String word, boolean[][] used, int x, int y, int wordIndex) {
        if (wordIndex == word.length())
            return true;
        if (x < 0 || x >= used.length || y < 0 || y >= used[0].length || used[x][y]
                || board[x][y] != word.charAt(wordIndex)) {
            return false;
        }
        used[x][y] = true;
        boolean a = recur(board, word, used, x + 1, y, wordIndex + 1),
                b = recur(board, word, used, x - 1, y, wordIndex + 1),
                c = recur(board, word, used, x, y + 1, wordIndex + 1),
                d = recur(board, word, used, x, y - 1, wordIndex + 1);
        if (a || b || c || d)
            return true;
        used[x][y] = false;
        return false;
    }
}
