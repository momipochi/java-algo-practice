package com.example.LeetCode.L101_symmetricTree;

import com.example.classes.TreeNode;

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }
        return l.val == r.val && isMirror(l.right, r.left) && isMirror(r.right, l.left);
    }
}
