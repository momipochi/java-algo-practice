package com.example.LeetCode.L494_TargetSum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TargetSumTest {
    @Test
    public void testFindTargetSumWays() {
        TargetSum ts = new TargetSum();
        int[] num = new int[] { 1, 1, 1, 1, 1 };
        assertEquals(5, ts.findTargetSumWays(num, 3));
    }
}
