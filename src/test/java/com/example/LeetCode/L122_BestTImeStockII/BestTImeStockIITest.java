package com.example.LeetCode.L122_BestTImeStockII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTImeStockIITest {
    @Test
    public void testMaxProfit() {
        BestTImeStockII s = new BestTImeStockII();
        assertEquals(7, s.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }
}
