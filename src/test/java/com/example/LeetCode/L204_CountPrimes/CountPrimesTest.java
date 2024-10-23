package com.example.LeetCode.L204_CountPrimes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountPrimesTest {
    @Test
    public void testCountPrimes() {
        CountPrimes cp = new CountPrimes();
        assertEquals(4, cp.countPrimes(10));
        assertEquals(4, cp.countPrimes(8));
    }
}
