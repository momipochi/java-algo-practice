package com.example.L55_JumpGame;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JumpGameTest {
    @Test
    public void testCanJump() {
        JumpGame jg = new JumpGame();
        int[] cs = new int[] { 2, 3, 1, 1, 4 };
        assertTrue(jg.canJump(cs));
    }
}
