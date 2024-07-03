package com.example.LeetCode.L95_uniqueBinarySearchTreesII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.classes.Coord;
import com.example.classes.TreeNode;

// https://leetcode.com/problems/unique-binary-search-trees-ii/
public class UniqueBinarySearchTreesII {

    public static List<TreeNode> generateTrees(int n) {

        return generateSubtrees(new Coord(1, n), new HashMap<>());
    }

    private static List<TreeNode> generateSubtrees(Coord coord, Map<Coord, List<TreeNode>> map) {
        List<TreeNode> res = new ArrayList<>();
        if (coord.x > coord.y) {
            res.add(null);
            return res;
        }
        if (map.containsKey(coord)) {
            return map.get(coord);
        }

        for (int i = coord.x; i <= coord.y; i++) {
            List<TreeNode> left = generateSubtrees(new Coord(coord.x, i - 1), map);
            List<TreeNode> right = generateSubtrees(new Coord(i + 1, coord.y), map);
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
