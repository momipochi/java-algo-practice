package com.example.L51_NQueens;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.utils.Utils;

public class NQueensTest {
    @Test
    public void testSolveNQueens() {
        String[][] c = new String[][] { { ".Q..", "...Q", "Q...", "..Q." }, { "..Q.", "Q...", "...Q", ".Q.." } };
        assertTrue(Utils.Is2DListEqualTo2DArray(NQueens.solveNQueens(4), c));
    }
}
