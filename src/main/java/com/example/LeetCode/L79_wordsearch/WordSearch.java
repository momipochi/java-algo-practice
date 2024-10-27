package com.example.LeetCode.L79_wordsearch;

// https://leetcode.com/problems/word-search/description/

// Given an m x n grid of characters board and a string word, return true if word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

/*
 * Simple dfs algorithm. Run recursion once you find the index that matches the 0th index of the word,
 * this way we avoid running for every index, as that is unnecessary. Our formal return condition is when
 * the current word index reaches the word's length, this means that we have reached the end of the word,
 * as there should be no possbility to continue if x y < 0 >= board.length used[x][y] and so on. We just need
 * to run recursion again for all directions, if any returns true, we return true. Keep in mind to backtrack
 * by marking used[x][y] as true and later false.
 */

public class WordSearch {
    char[] wordArr;
    char[][] board;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        wordArr = word.toCharArray();
        boolean[][] used = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == wordArr[0] && existsWord(used, 0, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean existsWord(boolean[][] used, int charIndex, int x, int y) {
        if (charIndex == wordArr.length) {
            return true;
        }
        if (x < 0 || y < 0 || x >= board.length || y >= board[x].length || used[x][y]
                || board[x][y] != wordArr[charIndex]) {
            return false;
        }

        used[x][y] = true;
        boolean res = existsWord(used, charIndex + 1, x + 1, y) ||
                existsWord(used, charIndex + 1, x - 1, y) ||
                existsWord(used, charIndex + 1, x, y + 1) ||
                existsWord(used, charIndex + 1, x, y - 1);
        used[x][y] = false;
        return res;
    }

}
