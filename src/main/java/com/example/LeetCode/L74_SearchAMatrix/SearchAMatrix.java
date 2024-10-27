package com.example.LeetCode.L74_SearchAMatrix;

// https://leetcode.com/problems/search-a-2d-matrix/description/
public class SearchAMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (target > matrix[i][matrix[0].length - 1]) {
                continue;
            } else {
                int l = 0, r = matrix[0].length - 1;
                while (l <= r) {
                    int m = (r + l) / 2;
                    if (matrix[i][m] == target) {
                        return true;
                    } else if (matrix[i][m] > target) {
                        r = m - 1;
                    } else {
                        l = m + 1;
                    }
                }
                return false;
            }

        }
        return false;
    }

}
