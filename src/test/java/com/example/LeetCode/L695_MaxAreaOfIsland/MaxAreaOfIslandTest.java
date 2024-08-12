package com.example.LeetCode.L695_MaxAreaOfIsland;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxAreaOfIslandTest {
    @Test
    public void testMaxAreaOfIsland() {
        int[][] cas = new int[][] { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        int ans = 6;
        MaxAreaOfIsland m = new MaxAreaOfIsland();
        assertEquals(ans, m.maxAreaOfIsland(cas));
    }
}
