package com.example.LeetCode.L868_BinaryGap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryGapTest {
    @Test
    public void testBinaryGap() {
        int in = 22;
        int out = 2;
        BinaryGap bg = new BinaryGap();
        assertEquals(out, bg.binaryGap(in));
    }
}
