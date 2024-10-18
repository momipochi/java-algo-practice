package com.example.LeetCode.L387_FirstUniqueCharacter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstUniqueCharacterTest {
    @Test
    public void testFirstUniqChar() {
        FirstUniqueCharacter fc = new FirstUniqueCharacter();
        assertEquals(0, fc.firstUniqChar("leetcode"));
        assertEquals(2, fc.firstUniqChar("loveleetcode"));
        assertEquals(-1, fc.firstUniqChar("aabb"));
    }
}
