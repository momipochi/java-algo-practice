package com.example.LeetCode.L3_LongestSubstringWithoutRepeat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringWithoutRepeatTest {
    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubstringWithoutRepeat lp = new LongestSubstringWithoutRepeat();
        String c = "abcabcbb";
        assertEquals(3, lp.lengthOfLongestSubstring(c));
    }
}
