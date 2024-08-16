package com.example.LeetCode.L463_IslandPerimeter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IslandPerimeterTest {
    @Test
    public void testIslandPerimeter() {
        IslandPerimeter ip = new IslandPerimeter();
        int[][] grid = new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
        int ans = 16;
        assertEquals(ans, ip.islandPerimeter(grid));
    }
}
