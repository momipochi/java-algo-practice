package com.example.LeetCode.L70_ClimbingStairs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClimbingStairsTest {
    @Test
    public void testClimbStairs() {
        ClimbingStairs c = new ClimbingStairs();
        assertEquals(2, c.climbStairs(2));
    }
}
