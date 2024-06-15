package com.example.L101_SymmetricTree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.L101_symmetricTree.SymmetricTree;
import com.example.classes.TreeNode;

public class SymmetricTreeTest {
    @Test
    public void testIsSymmetric() {
        TreeNode c = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        assertTrue(SymmetricTree.isSymmetric(c));
    }
}
