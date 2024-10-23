package com.example.LeetCode.L50_Pow;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PowTest {

    @Test
    public void testMyPow() {
        Pow p = new Pow();
        assertTrue(1024.0 == p.myPow(2.0, 10));
    }
}
