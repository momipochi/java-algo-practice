package com.example.L53_MaximumSubarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumSubarrayTest {
    @Test
    public void testMaxSubArray() {
        MaximumSubarray ms = new MaximumSubarray();
        int[] cs = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        assertEquals(ms.maxSubArray(cs), 6);
    }
}
