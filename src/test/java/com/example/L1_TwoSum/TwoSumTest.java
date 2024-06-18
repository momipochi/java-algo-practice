package com.example.L1_TwoSum;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        TwoSum ts = new TwoSum();
        int[] cs = new int[] { 3, 2, 4 };
        int c = 6;
        int[] ans = new int[] { 1, 2 };
        assertArrayEquals(ts.twoSum(cs, c), ans);
    }
}
