package com.example.LeetCode.L2087_MincostGrid;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MincostGridTest {
    @Test
    public void testMinCost() {
        MincostGrid mg = new MincostGrid();

        assertEquals(18,
                mg.minCost(new int[] { 1, 0 }, new int[] { 2, 3 }, new int[] { 5, 4, 3 }, new int[] { 8, 2, 6, 7 }));
    }
}
