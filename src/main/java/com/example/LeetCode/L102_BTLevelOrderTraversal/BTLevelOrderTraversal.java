package com.example.LeetCode.L102_BTLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

import com.example.classes.TreeNode;

// https://leetcode.com/problems/binary-tree-level-order-traversal/description/
public class BTLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        levelTraverse(res, 0, root);
        return res;
    }

    public static void levelTraverse(List<List<Integer>> res, int depth, TreeNode n) {
        if (n == null) {
            return;
        }
        if (depth == res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(depth).add(n.val);
        levelTraverse(res, depth + 1, n.left);
        levelTraverse(res, depth + 1, n.right);
    }
}
