package com.example.LeetCode.L77_combinations;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.utils.Utils;

public class CombinationsTest {

    @Test
    public void test() {
        int[][] cases = new int[][] { { 4, 2 } };
        int[][][] ans = new int[][][] { { { 1, 2 }, { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 3, 4 } } };
        Combinations c = new Combinations();
        for (int i = 0; i < cases.length; i++) {
            assertTrue(Utils.Is2DListEqualTo2DArray(c.combine(cases[i][0], cases[i][1]), ans[i]));
        }
    }
}
