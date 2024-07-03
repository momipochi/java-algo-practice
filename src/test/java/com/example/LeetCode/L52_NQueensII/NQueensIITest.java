package com.example.LeetCode.L52_NQueensII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NQueensIITest {
    @Test
    public void testTotalNQueens() {
        NQueensII qn = new NQueensII();
        assertEquals(2, qn.totalNQueens(4));
    }
}
