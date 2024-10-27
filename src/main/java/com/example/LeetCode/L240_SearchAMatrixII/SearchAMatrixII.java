package com.example.LeetCode.L240_SearchAMatrixII;

public class SearchAMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[row].length - 1;
        while (row < matrix.length && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
