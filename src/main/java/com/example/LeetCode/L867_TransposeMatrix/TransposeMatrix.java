package com.example.LeetCode.L867_TransposeMatrix;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int row = 0, col = 0;
        int[][] res = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res[row][col] = matrix[i][j];
                row++;
                if (row == matrix[i].length) {
                    row = 0;
                    col++;
                }
            }
        }
        return res;
    }
}
