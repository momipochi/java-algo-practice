package com.example.LeetCode.L103_BTZigZagLevelOrderTraversal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.classes.TreeNode;
import com.example.utils.Utils;

public class BTZigZagLevelOrderTraversalTest {
    @Test
    public void testZigzagLevelOrder() {
        int[][] ans = new int[][] { { 3 }, { 20, 9 }, { 15, 7 } };
        TreeNode node = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertTrue(Utils.Is2DListEqualTo2DArray(BTZigZagLevelOrderTraversal.zigzagLevelOrder(node), ans));
    }
}
