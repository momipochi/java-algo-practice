package com.example.LeetCode.L240_SearchAMatrixII;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SearchAMatrixIITest {
    @Test
    public void testSearchMatrix() {
        SearchAMatrixII s = new SearchAMatrixII();
        int[][] n = new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        assertTrue(s.searchMatrix(n, 5));
    }
}
