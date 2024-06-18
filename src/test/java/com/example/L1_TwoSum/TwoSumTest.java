package com.example.L1_TwoSum;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        TwoSum ts = new TwoSum();
        int[] cs = new int[] { 2, 7, 11, 15 };
        int c = 9;
        int[] ans = new int[] { 0, 1 };
        assertArrayEquals(ts.twoSum(cs, c), ans);
    }
}
