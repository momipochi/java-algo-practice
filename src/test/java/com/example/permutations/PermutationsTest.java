package com.example.permutations;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class PermutationsTest {
    @Test
    public void test() {
        int[][] cases = new int[][] { { 1, 2, 3 } };
        int[][][] ans = new int[][][] {
                { { 1, 2, 3 }, { 1, 3, 2 }, { 2, 1, 3 }, { 2, 3, 1 }, { 3, 1, 2 }, { 3, 2, 1 } } };

        for (int i = 0; i < ans.length; i++) {
            assertTrue(Is2DListEqualTo2DArray(Permutations.permute(cases[i]), ans[i]));
        }
    }

    private boolean Is2DListEqualTo2DArray(List<List<Integer>> list, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (list.get(i).get(j) != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
