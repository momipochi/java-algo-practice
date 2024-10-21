package com.example.LeetCode.L121_BestTimeStock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeStockTest {
    @Test
    public void testMaxProfit() {
        BestTimeStock b = new BestTimeStock();
        int[] pr = new int[] { 7, 1, 5, 3, 6, 4 };
        assertEquals(5, b.maxProfit(pr));
    }
}
