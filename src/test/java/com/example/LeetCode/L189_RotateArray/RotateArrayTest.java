package com.example.LeetCode.L189_RotateArray;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateArrayTest {

    @Test
    public void testRotate() {
        int[] cs = new int[] { -1, -100, 3, 99 };
        int r = 2;
        int[] ans = new int[] { 3, 99, -1, -100 };
        RotateArray ra = new RotateArray();
        ra.rotate(cs, r);
        assertArrayEquals(ans, cs);
    }
}
