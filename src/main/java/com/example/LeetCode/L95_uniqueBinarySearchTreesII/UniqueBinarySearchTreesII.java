package com.example.LeetCode.L95_uniqueBinarySearchTreesII;

import java.util.ArrayList;
import java.util.List;
import com.example.classes.TreeNode;

// https://leetcode.com/problems/unique-binary-search-trees-ii/
public class UniqueBinarySearchTreesII {

    public static List<TreeNode> generateTrees(int n) {
        return n > 0 ? generate_trees(1, n) : new ArrayList<>();
    }

    private static List<TreeNode> generate_trees(int start, int end) {
        List<TreeNode> res = new ArrayList<>();
        if (start > end) {
            res.add(null);
            return res;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = generate_trees(start, i - 1);
            List<TreeNode> right = generate_trees(i + 1, end);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode tree = new TreeNode(i, l, r);
                    res.add(tree);
                }
            }
        }
        return res;
    }

}
