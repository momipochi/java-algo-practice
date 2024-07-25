package com.example.LeetCode.LeetCode150.L36_ValidSudoku;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidSudokuTest {
    @Test
    public void testSolution() {
        ValidSudoku vs = new ValidSudoku();
        char[][] tmp = new char[][] {
                { '.', '.', '.', '.', '5', '.', '.', '1', '.' },
                { '.', '4', '.', '3', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '3', '.', '.', '1' },
                { '8', '.', '.', '.', '.', '.', '.', '2', '.' },
                { '.', '.', '2', '.', '7', '.', '.', '.', '.' },
                { '.', '1', '5', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '2', '.', '.', '.' },
                { '.', '2', '.', '9', '.', '.', '.', '.', '.' },
                { '.', '.', '4', '.', '.', '.', '.', '.', '.' },
        };
        assertTrue(!vs.Solution(tmp));
    }
}
