package com.example.LeetCode.L11_ContainerWithMostWater;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContainerWithMostWaterTest {
    @Test
    public void testMaxArea() {
        ContainerWithMostWater c = new ContainerWithMostWater();
        assertEquals(49, c.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }
}
