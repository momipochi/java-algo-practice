package com.example.L100_sameTree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.L100_sameTree.SameTree;
import com.example.classes.TreeNode;

public class SameTreeTest {
    @Test
    public void testIsSameTree() {
        TreeNode n = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode n2 = new TreeNode(1, new TreeNode(2), null);

        assertTrue(SameTree.isSameTree(n, n2) == false);
    }
}
