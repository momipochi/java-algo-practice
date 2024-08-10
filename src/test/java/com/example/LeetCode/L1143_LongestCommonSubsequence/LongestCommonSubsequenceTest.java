package com.example.LeetCode.L1143_LongestCommonSubsequence;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonSubsequenceTest {
    @Test
    public void testLongestCommonSubsequence() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String text1 = "psnw";
        String text2 = "vozsh";
        int answer = 1;
        assertEquals(answer, lcs.longestCommonSubsequence(text1, text2));
    }
}
