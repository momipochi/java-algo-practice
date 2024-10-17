package com.example.LeetCode.L443_StringCompression;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCompressionTest {
    @Test
    public void testCompress() {
        StringCompression sc = new StringCompression();
        char[] c = new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        char[] a = new char[] { 'a', '2', 'b', '2', 'c', '3' };
        assertEquals(6, sc.compress(c));
        for (int i = 0; i < a.length; i++) {
            assertEquals(a[i], c[i]);
        }
    }
}
