package com.example.LeetCode.L84_largestRectHistogram;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestRectHistogramTest {

    @Test
    public void testLargestRectangleArea() {
        int[][] cases = new int[][] { { 2, 1, 5, 6, 2, 3 }, { 2, 4 } };
        int[] ans = new int[] { 10, 4 };

        for (int i = 0; i < ans.length; i++) {
            assertEquals(ans[i], LargestRectHistogram.largestRectangleArea(cases[i]));
        }
    }
}
