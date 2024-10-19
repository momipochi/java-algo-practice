package com.example.LeetCode.L931_MinimumFallingPathSum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumFallingPathSumTest {
    @Test
    public void testMinFallingPathSum() {
        MinimumFallingPathSum m = new MinimumFallingPathSum();
        int[][] a = new int[][] { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
        assertEquals(13, m.minFallingPathSum(a));
    }
}
