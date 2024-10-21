package com.example.LeetCode.L62_UniquePaths;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UniquePathsTest {
    @Test
    public void testUniquePaths() {
        UniquePaths u = new UniquePaths();
        assertEquals(28, u.uniquePaths(3, 7));
    }
}
