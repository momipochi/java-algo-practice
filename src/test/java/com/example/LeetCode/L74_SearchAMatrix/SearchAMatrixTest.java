package com.example.LeetCode.L74_SearchAMatrix;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SearchAMatrixTest {
    @Test
    public void testSearchMatrix() {
        SearchAMatrix s = new SearchAMatrix();
        int[][] n = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        assertTrue(s.searchMatrix(n, 3));
    }
}
