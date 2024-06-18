package com.example.L56_MergeIntervals;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeIntervalsTest {
    @Test
    public void testMerge() {
        int[][] cs = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] ans = new int[][] { { 1, 6 }, { 8, 10 }, { 15, 18 } };
        MergeIntervals mi = new MergeIntervals();
        assertArrayEquals(mi.merge(cs), ans);
    }
}
