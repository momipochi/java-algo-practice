package com.example.L96_uniqueBinarySearchTrees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.L96_uniqueBinarySearchTrees.UniqueBinarySearchTrees;

public class UniqueBinarySearchTreesTest {
    @Test
    public void testNumTrees() {
        int c = 3;
        int a = 5;

        assertEquals(a, UniqueBinarySearchTrees.numTrees(c));
    }
}
