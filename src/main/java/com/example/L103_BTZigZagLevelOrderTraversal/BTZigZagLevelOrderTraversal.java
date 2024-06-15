package com.example.L103_BTZigZagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

import com.example.classes.TreeNode;

public class BTZigZagLevelOrderTraversal {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        zigZagLevelTraverse(res, 0, root);
        return res;
    }

    private static void zigZagLevelTraverse(List<List<Integer>> res, int depth, TreeNode n) {
        if (n == null) {
            return;
        }
        if (depth == res.size()) {
            res.add(new ArrayList<>());
        }
        if (depth % 2 == 0) {
            res.get(depth).add(n.val);
        } else {
            res.get(depth).add(0, n.val);
        }
        zigZagLevelTraverse(res, depth + 1, n.left);
        zigZagLevelTraverse(res, depth + 1, n.right);
    }
}
