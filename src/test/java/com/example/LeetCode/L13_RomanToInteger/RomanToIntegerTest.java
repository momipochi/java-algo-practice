package com.example.LeetCode.L13_RomanToInteger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {
    @Test
    public void testRomanToInt() {
        RomanToInteger r = new RomanToInteger();
        assertEquals(3, r.romanToInt("III"));
    }
}
