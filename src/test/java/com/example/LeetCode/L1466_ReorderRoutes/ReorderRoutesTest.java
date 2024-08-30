package com.example.LeetCode.L1466_ReorderRoutes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReorderRoutesTest {
    @Test
    public void testMinReorder() {
        ReorderRoutes rr = new ReorderRoutes();
        int[][] cn = new int[][] { { 0, 1 }, { 1, 3 }, { 2, 3 }, { 4, 0 }, { 4, 5 } };
        assertEquals(3, rr.minReorder(6, cn));
    }
}
