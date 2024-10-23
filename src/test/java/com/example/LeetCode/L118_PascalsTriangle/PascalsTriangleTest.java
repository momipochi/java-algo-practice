package com.example.LeetCode.L118_PascalsTriangle;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.utils.Utils;

public class PascalsTriangleTest {
    @Test
    public void testGenerate() {
        PascalsTriangle p = new PascalsTriangle();
        assertTrue(Utils.Is2DListEqualTo2DArray(p.generate(5),
                new int[][] { { 1 }, { 1, 1 }, { 1, 2, 1 }, { 1, 3, 3, 1 }, { 1, 4, 6, 4, 1 } }));

    }
}
