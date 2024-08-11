package com.example.LeetCode.L200_NumberofIslands;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberofIslandsTest {
    @Test
    public void testNumIslands() {
        NumberofIslands ni = new NumberofIslands();
        char[][] grid = new char[][] {
                { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' }
        };
        int ans = 1;

        assertEquals(ans, ni.numIslands(grid));
    }
}
