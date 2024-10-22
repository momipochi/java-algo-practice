package com.example.LeetCode.L74_SearchAMatrix;

// https://leetcode.com/problems/search-a-2d-matrix/description/
public class SearchAMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (target > matrix[i][matrix[i].length - 1]) {
                continue;
            }
            int l = 0, r = matrix[i].length - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (target == matrix[i][mid]) {
                    return true;
                } else if (target < matrix[i][mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return false;
    }

}
