package com.example.LeetCode.L46_permutations;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.utils.Utils;

public class PermutationsTest {
    @Test
    public void test() {
        int[][] cases = new int[][] { { 1, 2, 3 } };
        int[][][] ans = new int[][][] {
                { { 1, 2, 3 }, { 1, 3, 2 }, { 2, 1, 3 }, { 2, 3, 1 }, { 3, 1, 2 }, { 3, 2, 1 } } };

        Permutations p = new Permutations();
        for (int i = 0; i < ans.length; i++) {
            assertTrue(Utils.Is2DListEqualTo2DArray(p.permute(cases[i]), ans[i]));
        }
    }

}
