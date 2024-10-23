package com.example.LeetCode.L63_UniquePathsII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UniquePathsIITest {
    @Test
    public void testUniquePathsWithObstacles() {
        UniquePathsII u = new UniquePathsII();
        assertEquals(2, u.uniquePathsWithObstacles(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }));
    }
}
