package com.example.LeetCode.L20_ValidParentheses;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

// https://leetcode.com/problems/valid-parentheses/

public class ValidParenthesesTest {
    @Test
    public void testIsValid() {
        ValidParentheses vp = new ValidParentheses();
        assertTrue(vp.isValid("(((((((())))))))"));
    }
}
