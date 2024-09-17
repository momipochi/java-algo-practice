package com.example.LeetCode.L49_JumpGameII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JumpGameIITest {
    @Test
    public void testJump() {
        JumpGameII jg = new JumpGameII();
        int[] c = new int[] { 2, 3, 1, 1, 4 };
        assertEquals(2, jg.jump(c));
    }
}
