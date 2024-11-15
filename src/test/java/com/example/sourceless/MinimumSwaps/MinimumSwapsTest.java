package com.example.sourceless.MinimumSwaps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumSwapsTest {
    @Test
    public void testMinSwaps() {
        MinimumSwaps ms = new MinimumSwaps();
        String input = "(()))(";
        assertEquals(1, ms.minSwaps(input));
        assertEquals(-1, ms.minSwaps("()())"));
    }
}
