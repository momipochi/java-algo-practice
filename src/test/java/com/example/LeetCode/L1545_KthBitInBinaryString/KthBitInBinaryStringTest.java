package com.example.LeetCode.L1545_KthBitInBinaryString;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthBitInBinaryStringTest {
    @Test
    public void testFindKthBit() {
        KthBitInBinaryString k = new KthBitInBinaryString();
        assertEquals('1', k.findKthBit(3, 1));
        assertEquals('1', k.findKthBit(4, 11));
    }
}
