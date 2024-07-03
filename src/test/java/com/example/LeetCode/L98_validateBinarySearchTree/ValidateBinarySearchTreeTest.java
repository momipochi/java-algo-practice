package com.example.LeetCode.L98_validateBinarySearchTree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.classes.TreeNode;

public class ValidateBinarySearchTreeTest {
    @Test
    public void testIsValidBST() {
        TreeNode tn = new TreeNode(5, new TreeNode(4),
                new TreeNode(7, new TreeNode(6), new TreeNode(8, new TreeNode(1), new TreeNode(9))));

        assertTrue(ValidateBinarySearchTree.isValidBST(tn) == false);
    }
}
