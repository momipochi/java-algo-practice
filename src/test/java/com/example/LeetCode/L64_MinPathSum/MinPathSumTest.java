package com.example.LeetCode.L64_MinPathSum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinPathSumTest {
    @Test
    public void testMinPathSum() {
        int[][] c = new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        MinPathSum mps = new MinPathSum();
        assertEquals(7, mps.minPathSum(c));
    }
}
