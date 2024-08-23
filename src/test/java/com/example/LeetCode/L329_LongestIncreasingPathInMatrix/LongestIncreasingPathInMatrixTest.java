package com.example.LeetCode.L329_LongestIncreasingPathInMatrix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestIncreasingPathInMatrixTest {
    @Test
    public void testLongestIncreasingPath() {
        int[][] matrix = new int[][] { { 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } };
        LongestIncreasingPathInMatrix l = new LongestIncreasingPathInMatrix();
        assertEquals(4, l.longestIncreasingPathNaive(matrix));
    }
}
