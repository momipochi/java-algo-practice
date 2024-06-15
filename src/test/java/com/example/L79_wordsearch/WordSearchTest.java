package com.example.L79_wordsearch;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordSearchTest {

    @Test
    public void testExist() {
        char[][][] cases = new char[][][] {
                { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } } };
        String[] words = new String[] { "ABCCED" };

        for (int i = 0; i < words.length; i++) {
            assertTrue(WordSearch.exist(cases[i], words[i]));
        }
    }
}
