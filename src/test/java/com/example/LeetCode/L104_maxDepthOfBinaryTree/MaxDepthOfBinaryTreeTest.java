package com.example.LeetCode.L104_maxDepthOfBinaryTree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.classes.TreeNode;

public class MaxDepthOfBinaryTreeTest {
    @Test
    public void testMaxDepth() {
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(9);
        t.right = new TreeNode(20);
        t.right.right = new TreeNode(7);
        t.right.left = new TreeNode(15);
        assertTrue(MaxDepthOfBinaryTree.maxDepth(t) == 3);
    }
}
