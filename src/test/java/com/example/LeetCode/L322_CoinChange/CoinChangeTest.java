package com.example.LeetCode.L322_CoinChange;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinChangeTest {
    @Test
    public void testCoinChange() {
        CoinChange c = new CoinChange();
        assertEquals(3, c.coinChange(new int[] { 1, 2, 5 }, 11));
        assertEquals(4, c.coinChange(new int[] { 2, 5, 10, 1 }, 27));
        assertEquals(20, c.coinChange(new int[] { 186, 419, 83, 408 }, 6249));
    }

}
