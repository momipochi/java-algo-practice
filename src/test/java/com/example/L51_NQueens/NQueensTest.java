package com.example.L51_NQueens;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.utils.Utils;

public class NQueensTest {
    @Test
    public void testSolveNQueens() {
        NQueens nq = new NQueens();
        String[][] c = new String[][] { { ".Q..", "...Q", "Q...", "..Q." }, { "..Q.", "Q...", "...Q", ".Q.." } };
        assertTrue(Utils.Is2DListEqualTo2DArray(nq.solveNQueens(4), c));
    }
}
