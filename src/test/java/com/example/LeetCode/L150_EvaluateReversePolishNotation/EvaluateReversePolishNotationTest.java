package com.example.LeetCode.L150_EvaluateReversePolishNotation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvaluateReversePolishNotationTest {
    @Test
    public void testEvalRPN() {
        String[] tokesn = new String[] { "2", "1", "+", "3", "*" };
        int ans = 9;
        EvaluateReversePolishNotation e = new EvaluateReversePolishNotation();
        assertEquals(ans, e.evalRPN(tokesn));
    }
}
