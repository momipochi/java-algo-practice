package com.example.L51_NQueens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/n-queens/

public class NQueens {
    List<List<String>> res = new ArrayList<>();
    int[] colNumber;
    Map<Integer, String> map = new HashMap<>();

    public List<List<String>> solveNQueens(int n) {
        colNumber = new int[n];
        char[] c = new char[n];
        Arrays.fill(c, '.');
        for (int i = 0; i < n; i++) {
            c[i] = 'Q';
            map.put(i, new String(c));
            c[i] = '.';
        }
        dfs(n, 0, 0, 0, 0);
        return res;
    }

    private void dfs(int n, int row, int colOccupy, int diagonalOccupy1, int diagonalOccupy2) {
        if (row == n) {
            List<String> t = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                t.add(map.get(colNumber[i]));
            }
            res.add(t);
            return;
        }
        int availablePositions = ((1 << n) - 1) & (~(colOccupy | diagonalOccupy1 | diagonalOccupy2));
        while (availablePositions != 0) {
            int position = availablePositions & (-availablePositions);
            availablePositions = availablePositions & (availablePositions - 1);
            int col = Integer.bitCount(position - 1);
            colNumber[row] = col;
            dfs(n, row + 1, colOccupy | position, (diagonalOccupy1 | position) << 1, (diagonalOccupy2 | position) >> 1);
        }
    }

}
