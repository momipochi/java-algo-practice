package com.example.sourceless.ShortestUniqueSubstring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortestUniqueSubstringTest {
    @Test
    public void testSolution() {
        ShortestUniqueSubstring s = new ShortestUniqueSubstring();
        assertEquals(2, s.Solution("abaaba"));
        assertEquals(5, s.Solution("zyzyzyz"));
        assertEquals(3, s.Solution("aabbbabaaa"));
    }
}
