package com.example.L95_uniqueBinarySearchTreesII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.classes.TreeNode;

// https://leetcode.com/problems/unique-binary-search-trees-ii/
public class UniqueBinarySearchTreesII {
    public static class TreeNodeCoord {
        public int s;
        public int e;

        public TreeNodeCoord(int s, int e) {
            this.s = s;
            this.e = e;
        }
    }

    public static List<TreeNode> generateTrees(int n) {

        return generateSubtrees(new TreeNodeCoord(1, n), new HashMap<>());
    }

    private static List<TreeNode> generateSubtrees(TreeNodeCoord coord, Map<TreeNodeCoord, List<TreeNode>> map) {
        List<TreeNode> res = new ArrayList<>();
        if (coord.s > coord.e) {
            res.add(null);
            return res;
        }
        if (map.containsKey(coord)) {
            return map.get(coord);
        }

        for (int i = coord.s; i <= coord.e; i++) {
            List<TreeNode> left = generateSubtrees(new TreeNodeCoord(coord.s, i - 1), map);
            List<TreeNode> right = generateSubtrees(new TreeNodeCoord(i + 1, coord.e), map);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode node = new TreeNode(i, l, r);
                    res.add(node);
                }
            }
            map.putIfAbsent(coord, res);
        }

        return res;
    }

}
