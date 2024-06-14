package com.example.uniqueBinarySearchTrees;

import java.util.LinkedList;
import java.util.List;

import com.example.classes.TreeNode;

public class UniqueBinarySearchTrees {
    public static class TreeNodeCoord {
        public int s;
        public int e;

        public TreeNodeCoord(int s, int e) {
            this.s = s;
            this.e = e;
        }
    }

    public static List<TreeNode> generateTrees(int n) {

        return generateSubtrees(new TreeNodeCoord(1, n));
    }

    private static List<TreeNode> generateSubtrees(TreeNodeCoord coord) {
        List<TreeNode> res = new LinkedList<TreeNode>();
        if (coord.s > coord.e) {
            res.add(null); // empty tree
            return res;
        }

        for (int i = coord.s; i <= coord.e; ++i) {
            List<TreeNode> leftSubtrees = generateSubtrees(new TreeNodeCoord(coord.s, i - 1));
            List<TreeNode> rightSubtrees = generateSubtrees(new TreeNodeCoord(i + 1, coord.e));

            for (TreeNode left : leftSubtrees) {
                for (TreeNode right : rightSubtrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }

}
