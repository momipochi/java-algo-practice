package com.example.L102_BTLevelOrderTraversal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.L102_BTLevelOrderTraversal.BTLevelOrderTraversal;
import com.example.classes.TreeNode;
import com.example.utils.Utils;

public class BTLevelOrderTraversalTest {
    @Test
    public void testLevelOrder() {
        int[][] ans = new int[][] { { 3 }, { 9, 20 }, { 15, 7 } };
        TreeNode node = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertTrue(Utils.Is2DListEqualTo2DArray(BTLevelOrderTraversal.levelOrder(node), ans));
    }
}
